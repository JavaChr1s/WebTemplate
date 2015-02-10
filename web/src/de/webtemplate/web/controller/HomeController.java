/**
 * 
 */
package de.webtemplate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created for project animalFriends
 * 
 * @author Chris
 * @since 09.02.2015 - 20:22:22
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(final Model model) {

		model.addAttribute("project", "Animal friends!");

		return "home";
	}
}
