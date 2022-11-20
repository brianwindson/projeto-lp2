package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Registered {

	@JsonProperty("date")
	private String dateR;
	@JsonProperty("age")
	private Integer ageR;


	public String getdateR() {
		return dateR;
	}
	public void setdateR(String dateR) {
		this.dateR = dateR;
	}
	public Integer getAgeR() {
		return ageR;
	}
	public void setAge(Integer ageR) {
		this.ageR = ageR;
	}

	public Registered() {}
}
