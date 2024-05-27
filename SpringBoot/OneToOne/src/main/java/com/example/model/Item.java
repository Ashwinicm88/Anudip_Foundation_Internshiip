package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="itemdetails")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String itemName;
	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}

	
}
