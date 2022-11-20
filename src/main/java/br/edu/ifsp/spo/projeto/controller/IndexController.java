package br.edu.ifsp.spo.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.spo.projeto.models.Person;
import br.edu.ifsp.spo.projeto.services.PersonService;

@RestController
public class IndexController {

	private final PersonService personService;

	@Autowired
	public IndexController(PersonService personService) {
		this.personService = personService;
	}


	@RequestMapping(value="/index", method=RequestMethod.GET )
	public String index() {
		return "user/index";
	}


	@RequestMapping(value="/", method=RequestMethod.POST )
	public String index(Person person) {
		personService.addNewUser(person);
		return "redirect:/index";
	}

}
