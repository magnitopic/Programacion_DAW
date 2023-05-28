<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="NBA.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	BDController connexion = new BDController();
	String opt = request.getParameter("opt");
	if (opt == null)
		out.print("<h1>No se encuentra esta pagina</h1>");
	else if (opt.equalsIgnoreCase("delJugador")){
		if (connexion.checkJugador(request.getParameter("codJugador"))){
			connexion.delJugador(request.getParameter("codJugador"));
			out.print("<h1>Jugador eliminado con exito</h1>");			
		}else
			out.print("<h1>Jugador no econtrado</h1>");
	}else if (opt.equalsIgnoreCase("altaEquipo")){
		if (!connexion.checkEquipo(request.getParameter("nombre"))){
		Equipo equ = new Equipo(request.getParameter("nombre"), request.getParameter("ciudad"), request.getParameter("conferencia"), request.getParameter("division"));
		connexion.createEquipo(equ);
		out.print("<h1>Equipo creado con exito</h1>");
		}else
			out.print("<h1>Equipo ya existe</h1>");
	}else if (opt.equalsIgnoreCase("modEquipo")){
		Equipo eq = new Equipo(request.getParameter("nombre"), request.getParameter("ciudad"), request.getParameter("conferencia"), request.getParameter("division"));
		connexion.modEquipo(eq);
		out.print("<h1>Equipo modificado con exito</h1>");
	}
	%>
</body>
</html>