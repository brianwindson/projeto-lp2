package br.edu.ifsp.spo.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.spo.projeto.models.Person;
import br.edu.ifsp.spo.projeto.services.PersonService;

@RestController
@RequestMapping("/user")
public class PersonController {
	private final PersonService personService;


	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/list")
	public Iterable<Person> list(){
		return personService.list();
	}

}
