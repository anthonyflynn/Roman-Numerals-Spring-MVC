package roman_numeral_controller;

public class RomanNumeral {
	private int inputValue;
	private String romanNumeralValue;
	
	/* Constructor to initialise parameter values */
	public RomanNumeral() {
		inputValue = Integer.MAX_VALUE;
		romanNumeralValue = "";
	}
	
	/* Method takes the user input value and assigns it to the inputValue parameter.
	 * Returns false if user input invalid / out of range, or true if input valid*/
	public boolean input(String input) {
		int value;
		
		try {
			value = Integer.parseInt(input); // converts string into int value
		} catch(Exception e) {
			return false; // e.g. user enters double, string etc.
		}
		
		if(value >= 0 && value <= 3999) { // valid input entered
			inputValue = value;
			return true;
		}
		return false;
	}
		
	/* Getter method to return value of inputValue*/
	public int getInputValue() {
		return inputValue;
	}
	
	/* Setter method to set value of inputValue*/
	public void setInputValue(int value) {
		this.inputValue = value;
	}
	
	/* Getter method to return value of romanNumeral*/
	public String getRomanNumeralValue() {
		return romanNumeralValue;
	}
	
	/* Setter method to set value of romanNumeral*/
	public void setRomanNumeralValue(String romanNumeralEquiv) {
		this.romanNumeralValue = romanNumeralEquiv;
	}
	
	/* Method converts inputValue to its roman numeral equivalent and assigns
	 * this to the string romanNumeral*/
	public String romanNumeralEquivalent(int inputValue) {
		romanNumeralValue = getOnes(inputValue % 10) + romanNumeralValue; // adds units part
		inputValue /= 10;
		
		romanNumeralValue = getTens(inputValue % 10) + romanNumeralValue; // adds tens part
		inputValue /= 10;
		
		romanNumeralValue = getHundreds(inputValue % 10) + romanNumeralValue; // adds hundreds part
		inputValue /= 10;
		
		romanNumeralValue = getThousands(inputValue % 10) + romanNumeralValue; // adds thousands part
		
		return romanNumeralValue;
	}
	
	/* Method converts the integer inputValue into an equivalent roman numeral
	 * string and returns this string.  The parameters oneUnit, fiveUnit and tenUnit
	 * depend on whether inputValue is the units, tens or hundreds column of number
	 * being converted (e.g. for tens, the values are X(10), L(50) and C(100) respectively.*/
	private String getDigitEquivalent(int inputValue, String oneUnit, String fiveUnit, String tenUnit) {
		switch(inputValue) {
		case 0: return "";
		case 1: return oneUnit;
		case 2:	return oneUnit + oneUnit;
		case 3:	return oneUnit + oneUnit + oneUnit;
		case 4:	return oneUnit + fiveUnit;
		case 5: return fiveUnit;
		case 6: return fiveUnit + oneUnit;
		case 7: return fiveUnit + oneUnit + oneUnit;
		case 8: return fiveUnit + oneUnit + oneUnit + oneUnit;
		case 9:	return oneUnit + tenUnit;
		default:
			System.exit(-1);
			return "";
		}
	}
	
	/* Method to return the value in the ones units column of input*/
	public String getOnes(int inputValue) {
		return getDigitEquivalent(inputValue, "I", "V", "X");
	}
	
	/* Method to return the value in the tens units column of input*/
	public String getTens(int inputValue) {
		return getDigitEquivalent(inputValue, "X", "L", "C");
	}
	
	/* Method to return the value in the hundreds units column of input*/
	public String getHundreds(int inputValue) {
		return getDigitEquivalent(inputValue, "C", "D", "M");
	}
	
	/* Method to return the value in the thousands units column of input*/
	public String getThousands(int inputValue) {
		String thousandsString = "";
		for(int i = 0; i < inputValue; i++) {
			thousandsString += "M";
		}
		return thousandsString;
	}
}
