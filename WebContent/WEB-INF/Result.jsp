<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Roman Numeral Converter</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	<h1> Integer to Roman Numeral Converter</h1>
	
	<form action="/roman_numerals_spring_MVC/result.html" method="post">
	<h3> Enter another number between 0 and 3,999: </h3>
	<p>	
		<input type="text" name="input" placeholder= "Enter number:"/>
	</p>
	<input type="submit" value="Submit" />
	</form>
	
	<h3> Number in decimal: </h3>
	<p>${roman1.inputValue}</p>

	<h3> Equivalent in Roman Numerals:</h3>
	<p>${roman1.romanNumeralValue}</p>

</body>
</html>
