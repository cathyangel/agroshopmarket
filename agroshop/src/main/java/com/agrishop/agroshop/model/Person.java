package com.agrishop.agroshop.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String town;
	private Date birthday;
	private String phoneNumber;
	private String sexe;
	private String adress;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adress_id")
	private Adress adresse;
	
	
	@OneToOne(mappedBy="person")
	private User user;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id=id;
	}
	
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Adress getAdresse() {
		return adresse;
	}

	public void setAdresse(Adress adresse) {
		this.adresse = adresse;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
