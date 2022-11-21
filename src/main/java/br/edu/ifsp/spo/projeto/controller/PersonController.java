package br.edu.ifsp.spo.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifsp.spo.projeto.models.Person;
import br.edu.ifsp.spo.projeto.repository.PersonRepository;
import br.edu.ifsp.spo.projeto.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/list")
	public Iterable<Person> list(){
		return personService.list();
	}
	
	@GetMapping("/pessoas/lista/{pageNumber}")
	public String getOnePage(Model model, @PathVariable("pageNumber") int currentPage) {
		Page<Person> page = personService.findPage(currentPage);
		int totalPages = page.getTotalPages();
		long totalItem = page.getTotalElements();
		List<Person> persons = page.getContent();
		
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("totalItems", totalItem);
		model.addAttribute("persons", persons);
		
		return "user/index";
	}
	
	@GetMapping("/pessoas/lista/")
	public String getAllPages(Model model){
	    return getOnePage(model, 1);
	}

	@RequestMapping("/pessoas")
	public ModelAndView listaPessoas(){
		ModelAndView mv = new ModelAndView("user/index");
		Iterable<Person> pessoas = personRepository.findAll();
		mv.addObject("persons", pessoas);
		return mv;
	}

}
