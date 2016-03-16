package roman_numeral_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RomanNumeralController {


	@RequestMapping(value="/request.html", method = RequestMethod.GET)
	public ModelAndView getRequestPage() {

		ModelAndView model = new ModelAndView("Request");

		return model;
	}

	@RequestMapping(value="/result.html", method = RequestMethod.POST)
	public ModelAndView submitRequest(@RequestParam("input") String inputString) {

		ModelAndView model;
		
		RomanNumeral roman1 = new RomanNumeral();
		boolean valid = roman1.input(inputString);
		if(!valid) {
			model = new ModelAndView("Invalid");
		}
		else {
			String equivalent = roman1.romanNumeralEquivalent(roman1.getInputValue());
			roman1.setRomanNumeralValue(equivalent);
		
			model = new ModelAndView("Result");
			model.addObject("roman1", roman1);
		}
		return model;
	}
	
	@RequestMapping(value="/invalid.html", method = RequestMethod.GET)
	public ModelAndView getInvalidPage() {

		ModelAndView model = new ModelAndView("Invalid");

		return model;
	}
	
}

