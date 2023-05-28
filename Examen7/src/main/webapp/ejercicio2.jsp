<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="NBA.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
	<link rel="stylesheet" href="assets/css/main.css" />
	<title>Examen NBA</title>
</head>
<body class="is-preload">
		<div id="page-wrapper">
			<!-- Header -->
				<div id="header">

					<!-- Logo -->
						<h1>Jugadores NBA</h1>

					

				</div>

			<!-- Main -->
				<section class="wrapper style1">
					<div class="container">
						<div id="content">
						<%
							BDController connexion = new BDController();
							ArrayList<Jugador> jugadores = connexion.getJugadoresNacionalidad("argentina");
						%>

							<!-- Content -->
						
								<article>
									<header>
										<table >
											<tr style="border:0px;" >	
												<td style="background-color: white;"><h2>Jugadores</h2></td><td style="text-align: right;background-color: white;""></td>
											</tr>
										</table>
									</header>
									
									<div class="table-wrapper">
								<table class="alt">
									<thead>
										<tr>
											<th>Nombre</th>
											<th width='325' colspan="3"></th>
											<th style="text-align: center;">EQUIPO</th>
											<th style="text-align: center;">ALTURA</th>
											<th style="text-align: center;">PESO</th>
											<th style="text-align: center;">POSICION</th>
											<th style="text-align: center;">DIVISION</th>
											
										</tr>
									</thead>
									<tbody>
									<%
									for (Jugador j: jugadores){
										out.print(
												 "<tr>\r\n"
												+ "<td width='60' rowspan=\"2\"><img src=\"/ExamenJava/images/jugadores/"+j.getCodigo()+".png\" width=\"80\"></td>\r\n"
												+ "<td width='325' colspan=\"3\" style=\"padding-left: 15px;\">"+j.getNombre()+"</td>\r\n"
												+ "<td  rowspan=\"2\" width='60' style=\"text-align: center;\">"+j.getNombre_equipo()+"</td>	\r\n");
										if (Integer.parseInt(j.getAltura().split("-")[0]) >= 7)
											out.print("<td rowspan=\"2\" width='60' style=\"text-align: center;background: lightgreen\">"+j.getAltura()+"</td>\r\n");
										else
											out.print("<td rowspan=\"2\" width='60' style=\"text-align: center\">"+j.getAltura()+"</td>\r\n");
										out.print("<td rowspan=\"2\" width='100' style=\"text-align: center; \">"+j.getPeso()+"</td>	\r\n"
												+ "<td rowspan=\"2\" width='100' style=\"text-align: center;\">"+j.getPosicion()+"</td>	\r\n"
												+ "<td rowspan=\"2\" width='100' style=\"text-align: center;\">"+connexion.getEquipo(j.getNombre_equipo()).division+"</td>		\r\n"
												+ "</tr>\r\n"
												+ "<tr>\r\n"
												+ "<td width='45' style=\"text-align: right;\"><img src=\"/ExamenJava/images/banderas/"+j.getProcedencia()+".png\" width=\"40\"></td>\r\n"
												+ "<td width='50' style=\"text-align: center;\"></td>\r\n"
												+ "<td width='230'></td>\r\n"
												+ "</tr>\r\n");
									}
									%>
									</tbody>
								</table>
							</div>

									
								</article>

						</div>
					</div>
				</section>
			

			<!-- Footer -->
				<div id="footer">
					<div class="container">
						<div class="row">
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Listados</h3>
								<ul class="links">
									<li><a href="jugadores.asp">Listado de Ligas</a></li>
									
								
								</ul>
							</section>
							<section class="col-3 col-6-narrower col-12-mobilep">
								<h3>Más Opciones</h3>
								<ul class="links">
									<li><a href="operaciones.jsp?tipo=altaJugador">Opción 1</a></li>
									
								</ul>
							</section>
							<section class="col-6 col-12-narrower">
								<h3>Solicita Información</h3>
								<form>
									<div class="row gtr-50">
										<div class="col-6 col-12-mobilep">
											<input type="text" name="name" id="name" placeholder="Name" />
										</div>
										<div class="col-6 col-12-mobilep">
											<input type="email" name="email" id="email" placeholder="Email" />
										</div>
										<div class="col-12">
											<textarea name="message" id="message" placeholder="Message" rows="5"></textarea>
										</div>
										<div class="col-12">
											<ul class="actions">
												<li><input type="submit" class="button alt" value="Enviar Email" /></li>
											</ul>
										</div>
									</div>
								</form>
							</section>
						</div>
					</div>

					<!-- Icons -->
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
							<li><a href="#" class="icon fa-linkedin"><span class="label">LinkedIn</span></a></li>
							<li><a href="#" class="icon fa-google-plus"><span class="label">Google+</span></a></li>
						</ul>

					<!-- Copyright -->
						<div class="copyright">
							<ul class="menu">
								<li>&copy; FIFA 20. Todos los derechos reservados</li><li>Design: <a href="https://www.centronelson.org">Centro Nelson</a></li>
							</ul>
						</div>

				</div>

		</div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.dropotron.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
</body>
</html>