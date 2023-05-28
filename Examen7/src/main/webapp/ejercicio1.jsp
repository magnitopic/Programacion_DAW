<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 1</title>
</head>
<body>
	<%
		int val = 36;
		int[][] nums = new int[6][6];
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 6; j++){
				nums[i][j] = val;
				val--;
			}
		}
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 6; j++){
				if (i == 5 && j == 5)
					out.print(nums[i][j]+".");
				else
					out.print(nums[i][j]+", ");
			}
		}
	%>
</body>
</html>