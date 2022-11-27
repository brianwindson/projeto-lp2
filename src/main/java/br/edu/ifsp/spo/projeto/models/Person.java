package br.edu.ifsp.spo.projeto.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;


@Entity
@Table
public class Person {


	@Id
	@GeneratedValue(
				strategy = GenerationType.AUTO,
				generator = "user_sequence"
				)
	private Long id;

	public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

	@CsvBindByName
	private String gender;
	@CsvBindByName
	private String email;
	@CsvBindByName
	private String phone;
	@CsvBindByName
	private String cell;
	@Embedded
	private Name name;
	@Embedded
	private Location location;
	@Embedded
	private Dob dob;
	@CsvBindByName
	@Embedded
	private Registered registered;
	@Embedded
	private Picture picture;


	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Dob getDob() {
		return dob;
	}
	public void setDob(Dob dob) {
		this.dob = dob;
	}
	public Registered getRegistered() {
		return registered;
	}
	public void setRegistered(Registered registered) {
		this.registered = registered;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public Person() {}

}


