package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.opencsv.bean.CsvBindByName;

import br.edu.ifsp.spo.projeto.utils.Region;

@Embeddable
public class Location {

	@CsvBindByName
	private String street;
	@CsvBindByName
	private String city;
	@CsvBindByName
	private String state;
	@CsvBindByName
	private String postcode;
	@Embedded
	private Coordinates coordinates;
	@Embedded
	private Timezone timezone;


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public Timezone getTimezone() {
		return timezone;
	}
	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}




	public String getRegion(){
		Region rg = new Region();
		return rg.getRegion(state);
	}
	public Location() {
	}




}
