package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;

@Embeddable
public class Timezone {

	@CsvBindByName
	@JsonProperty("description")
	private String description;
	@CsvBindByName
	@JsonProperty("offset")
	private String offset;


	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getDescrption() {
		return description;
	}
	public void setDescrption(String description) {
		this.description = description;
	}

	public Timezone() {}
}
