package br.edu.ifsp.spo.projeto;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.ifsp.spo.projeto.models.Person;
import br.edu.ifsp.spo.projeto.services.PersonService;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PersonService personService) {

		return args -> {
			//le o json e insere no banco
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Person>> typeReference = new  TypeReference<>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/input-backend.json");
			try {
				List<Person> persons = mapper.readValue(inputStream, typeReference);
				personService.save(persons);
				System.out.println("usuarios salvos");
			} catch(IOException e) {
				System.out.println("não pude salvar:" + e.getMessage());
			}
		};

	}

}
