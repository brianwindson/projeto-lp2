package br.edu.ifsp.spo.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.ifsp.spo.projeto.models.Person;
import br.edu.ifsp.spo.projeto.repository.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;


	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Iterable<Person> list(){
		return personRepository.findAll();
	}

	public Page<Person> findPage(int pageNumber){
		Pageable pageable = PageRequest.of(pageNumber - 1, 8);
		return personRepository.findAll(pageable);
	}

	public Iterable<Person> save(List<Person> persons){
		return personRepository.saveAll(persons);

	}

	public Person  addNewUser(Person person) {
		return personRepository.save(person);

	}

}
