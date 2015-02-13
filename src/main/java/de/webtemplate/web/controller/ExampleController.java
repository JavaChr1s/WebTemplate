/**
 * 
 */
package de.webtemplate.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.webtemplate.dao.ExampleDAO;
import de.webtemplate.entity.Example;

/**
 * Created for project webTemplate
 * 
 * @author Chris
 * @since 09.02.2015 - 20:22:22
 */
@Controller
public class ExampleController {
	@Autowired
	private ExampleDAO exampleDAO;

	@RequestMapping(value = "/example", method = RequestMethod.GET)
	public String index(final Model model) {

		model.addAttribute("project", "Web Template");
		
//		final Example example = new Example();
//		example.setExampleAttribute("example");
//		exampleDAO.save(example);
		
		return "example";
	}
}
