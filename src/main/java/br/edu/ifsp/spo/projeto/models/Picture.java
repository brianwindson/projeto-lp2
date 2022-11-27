package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;

import com.opencsv.bean.CsvBindByName;

@Embeddable
public class Picture {

	@CsvBindByName
	private String large;
	@CsvBindByName
	private String medium;
	@CsvBindByName
	private String thumbnail;


	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}


	public Picture() {}

}
