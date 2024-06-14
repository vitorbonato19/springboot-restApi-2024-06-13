package com.spring.entity;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fisrtName;
	private String lastName;
	private String addres;
	private String gender;
	private String email;
	
	public Person() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
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
	
	@Override
	public int hashCode() {
		return Objects.hash(addres, email, fisrtName, gender, id, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(addres, other.addres) && Objects.equals(email, other.email)
				&& Objects.equals(fisrtName, other.fisrtName) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}
	
	
	
}
