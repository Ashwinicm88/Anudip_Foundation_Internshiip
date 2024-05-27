package com.example.Hibernate1To1realtion;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String userName;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String userName, Address address) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
	}


	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)//this defines foreign key in address Entity
	   private Address address;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", address=" + address + "]";
	}
	
	
	
}
