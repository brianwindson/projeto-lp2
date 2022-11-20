package br.edu.ifsp.spo.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifsp.spo.projeto.models.Person;


public interface PersonRepository extends CrudRepository<Person, Long>{


}
