package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embeddable;

import com.opencsv.bean.CsvBindByName;

import br.edu.ifsp.spo.projeto.utils.Effort;


@Embeddable
public class Coordinates {

	@CsvBindByName(column ="location__coordinates__longitude")
	private Double latitude;
	@CsvBindByName
	private Double longitude;


	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getEffort() {
		Effort ef = new Effort();
		return ef.getEffort(latitude, longitude);
	}
	public Coordinates() {}

}
