package EjercicioMusica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Controlador BBDD
		BDController conexionBD = new BDController();
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		while (true) {
			System.out.println("1.\tListado artistas");
			System.out.println("2.\tListado de canciones");
			System.out.println("3.\tListado de discos");
			System.out.println("4.\tListado de grupos");
			System.out.println("5.\tElimina una canción");
			System.out.println("6.\tElimina un artista");
			System.out.println("7.\tInsertar Artista");
			System.out.println("8.\tInsertar Canción");
			System.out.println("9.\tInsertar Grupo");
			System.out.println("10.\tInsertar artista en grupo");
			System.out.println("11.\tInsertar canción en disco");
			System.out.println("12.\tEliminar artista de grupo");
			System.out.println("13.\tMostrar el titulo de la canción más larga");
			System.out.println("14.\tListado de canciones con duración menor a la indicada");
			System.out.println("15.\tListado de canciones de un disco");
			System.out.println("16.\tArchivo de texto con las canciones de un grupo indicado");
			System.out.println("17.\tSalir");
			System.out.print("--> ");
			int opt = sn.nextInt();
			switch (opt) {
				case 1:
					for (Artista a : conexionBD.getArtistas()) {
						a.showData();
					}
					break;
				case 2:
					for (Cancion c : conexionBD.getCanciones()) {
						c.showData();
					}
					break;
				case 3:
					for (Disco d : conexionBD.getDiscos()) {
						d.showData();
					}
					break;
				case 4:
					for (Grupo g : conexionBD.getGrupos()) {
						g.showData();
					}
					break;
				case 5:
					System.out.print("Introduce el código de la canción a eliminar: ");
					String cod = sc.nextLine();
					if (conexionBD.existeCancion(cod))
						conexionBD.deleteCancion(cod);
					else
						System.out.println("La canción no existe");
					break;
				case 6:
					System.out.print("Introduce el DNI del artista a eliminar: ");
					String dni = sc.nextLine();
					if (conexionBD.existeArtista(dni))
						conexionBD.deleteArtista(dni);
					else
						System.out.println("El artista no existe");
					break;
				case 7:
					System.out.print("Introduce el DNI del artista: ");
					String dniArtista = sc.nextLine();
					System.out.print("Introduce el nombre del artista: ");
					String nombreArtista = sc.nextLine();
					if (!conexionBD.existeArtista(dniArtista))
						conexionBD.insertArtista(dniArtista, nombreArtista);
					else
						System.out.println("El artista ya existe");
					break;
				case 8:
					System.out.print("Introduce el código de la canción: ");
					String codCancion = sc.nextLine();
					System.out.print("Introduce el título de la canción: ");
					String tituloCancion = sc.nextLine();
					System.out.print("Introduce la duración de la canción: ");
					String duracionCancion = sc.nextLine();
					if (!conexionBD.existeCancion(codCancion))
						conexionBD.insertCancion(codCancion, tituloCancion, duracionCancion);
					else
						System.out.println("La canción ya existe");
					break;
				case 9:
					System.out.print("Introduce el código del grupo: ");
					String codGrupo = sc.nextLine();
					System.out.print("Introduce el nombre del grupo: ");
					String nombreGrupo = sc.nextLine();
					System.out.print("Introduce la fecha de creación del grupo: ");
					String fechaGrupo = sc.nextLine();
					System.out.print("Introduce el país de origen del grupo: ");
					String paisGrupo = sc.nextLine();
					if (!conexionBD.existeGrupo(codGrupo))
						conexionBD.insertGrupo(codGrupo, nombreGrupo, fechaGrupo, paisGrupo);
					else
						System.out.println("El grupo ya existe");
					break;
				case 10:
					insertarArtistaGrupo(conexionBD);
					break;
				case 11:
					insertarCancionDisco(conexionBD);
					break;
				case 12:
					eliminarArtistaGrupo(conexionBD);
					break;
				case 13:
					System.out.println("La canción más larga es: " + longestSongName(conexionBD));
					break;
				case 14:
					System.out.print("Introduce la duración máxima: ");
					double duracionMaxima = sn.nextDouble();
					for (Cancion c : conexionBD.getCanciones()) {
						if (Double.parseDouble(c.getDuracion()) < duracionMaxima)
							System.out.println(c.getTitulo());
					}
					break;
				case 15:
					System.out.print("Introduce el nombre del disco: ");
					String nomDisco = sc.nextLine();
					if (!conexionBD.existeDiscoNombre(nomDisco)){
						System.out.println("Ese disco no existe.");
						break;
					}
					for (Disco d : conexionBD.getDiscos()) {
						System.out.println("Disco: "+ d.getNombre());
						if (d.getNombre().equalsIgnoreCase(nomDisco)) {
							for (Cancion c : d.getDiscos()) {
								System.out.println(c.getTitulo());
							}
						}
					}
					break;
				case 16:
					grupoCancionesInFile(conexionBD);
					break;
				default:
					System.out.println("Bye!");
					sc.close();
					sn.close();
					return;
			}
		}
	}

	public static void insertarArtistaGrupo(BDController conexionBD) {
		Scanner sc = new Scanner(System.in);
		for (Artista a : conexionBD.getArtistas())
			a.showData();
		for (Grupo g : conexionBD.getGrupos())
			g.showData();
		System.out.print("Introduce el DNI del artista: ");
		String dniArtistaGrupo = sc.nextLine();
		System.out.print("Introduce el código del grupo: ");
		String codGrupoArtista = sc.nextLine();
		if (conexionBD.existeArtista(dniArtistaGrupo) && conexionBD.existeGrupo(codGrupoArtista))
			conexionBD.insertArtistaGrupo(dniArtistaGrupo, codGrupoArtista);
		else
			System.out.println("El artista o el grupo no existe");
		sc.close();
	}

	public static void insertarCancionDisco(BDController conexionBD) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el código del disco: ");
		String codDisco = sc.nextLine();
		System.out.print("Introduce el código de la canción: ");
		String codCancionDisco = sc.nextLine();
		if (conexionBD.existeDisco(codDisco) && conexionBD.existeCancion(codCancionDisco))
			conexionBD.insertCancionDisco(codDisco, codCancionDisco);
		else
			System.out.println("El disco o la canción no existe");
		sc.close();
	}

	public static void eliminarArtistaGrupo(BDController conexionBD) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el DNI del artista: ");
		String dniArtistaGrupo = sc.nextLine();
		System.out.print("Introduce el código del grupo: ");
		String codGrupoArtista = sc.nextLine();
		if (conexionBD.existeArtista(dniArtistaGrupo) && conexionBD.existeGrupo(codGrupoArtista))
			conexionBD.deleteArtistaGrupo(dniArtistaGrupo, codGrupoArtista);
		else
			System.out.println("El artista o el grupo no existe");
		sc.close();
	}

	public static String longestSongName(BDController conexionBD) {
		String longestName = "";
		double longestTime = 0;
		for (Cancion c : conexionBD.getCanciones()) {
			if (Double.parseDouble(c.getDuracion()) > longestTime) {
				longestName = c.getTitulo();
				longestTime = Double.parseDouble(c.getDuracion());
			}
		}
		return longestName;
	}

	public static void grupoCancionesInFile(BDController conexionBD) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del grupo: ");
		String nomGrupo = sc.nextLine();
		if (!conexionBD.existeGrupoName(nomGrupo)) {
			sc.close();
			System.out.println("Ese grupo no existe.");
			return;
		}
		File file = new File("./EjercicioMusica/" + nomGrupo + ".txt");
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file, true));
			br.write(nomGrupo + "\nCanciones: \n");
			for (Cancion c : conexionBD.getCancionesFromGrupo(conexionBD.getGrupoCod(nomGrupo))) {
				br.write(c.getTitulo());
				br.newLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error creando fichero en  grupoCancionesInFile: " + e);
		}
		sc.close();
	}
}
