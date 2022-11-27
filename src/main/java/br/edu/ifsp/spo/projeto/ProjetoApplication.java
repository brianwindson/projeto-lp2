package br.edu.ifsp.spo.projeto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

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
			InputStream inputCSV = TypeReference.class.getResourceAsStream("/json/input-backend.csv");
			try {
				List<Person> persons = mapper.readValue(inputStream, typeReference);
				personService.save(persons);
				System.out.println("usuarios salvos");
			} catch(IOException e) {
				System.out.println("não pude salvar:" + e.getMessage());
			}
		  // le o csv e insere
		    	   Reader reader = new BufferedReader(new InputStreamReader(inputCSV));

	                CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
	                        .withType(Person.class)
	                        .withIgnoreLeadingWhiteSpace(true)
	                        .build();
	                List<Person> persons = csvToBean.parse();
	                personService.save(persons);
					System.out.println("usuarios salvos");


		};

	}

}
