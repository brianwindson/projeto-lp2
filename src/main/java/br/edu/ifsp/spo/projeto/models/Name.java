package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

@Embeddable
public class Name {

	@CsvBindByName(column = "title", required = true)
	@CsvBindByPosition(position = 1)
	private String title;
	@CsvBindByName(column = "first")
	private String first;
	@CsvBindByName
	private String last;


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public Name() {

	}




}
