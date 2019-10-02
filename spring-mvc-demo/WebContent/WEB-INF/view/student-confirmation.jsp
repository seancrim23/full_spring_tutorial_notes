<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC - student confirmation</title>
</head>
<body>

	<h2>The student is confirmed: ${student.firstName} ${student.lastName}</h2>
	<p>Country: ${student.country}</p>
	<p>Favorite Language: ${student.favoriteLanguage}</p>
	<p>Operating Systems: </p>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>