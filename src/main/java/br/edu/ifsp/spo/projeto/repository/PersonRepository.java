package br.edu.ifsp.spo.projeto.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.edu.ifsp.spo.projeto.models.Person;


public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{


}
