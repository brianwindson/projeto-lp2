package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;
@Embeddable
public class Dob {

	private String date;
	private Integer age;


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Dob() {}


}
