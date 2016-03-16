<html>
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
