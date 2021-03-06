package controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = { "login" }, method = RequestMethod.GET)
	public ModelAndView vista(Model model, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("login");

		try {
			response.addCookie(new Cookie("miCookie", "The cookie value"));
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		}

		return mv;
	}

}
