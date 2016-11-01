package bd.ac.buet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebmailController {

	@RequestMapping(value="welcome")
	public String welcomeScreen() {
		return "welcome";
	}

}
