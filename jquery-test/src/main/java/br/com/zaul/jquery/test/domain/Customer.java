package br.com.zaul.jquery.test.domain;

public class Customer {

	private Integer id;
	private String firsName;
	private String lastName;
	private Integer age;
	
	public Customer() {
	}
	
	public Customer(Integer id, String firsName, String lastName, Integer age) {
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
