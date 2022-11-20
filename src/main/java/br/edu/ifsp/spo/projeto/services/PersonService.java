package br.edu.ifsp.spo.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public Iterable<Person> save(List<Person> persons){
		return personRepository.saveAll(persons);

	}

	public Person  addNewUser(Person person) {
		return personRepository.save(person);

	}

}
