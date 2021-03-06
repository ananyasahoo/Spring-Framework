package com.cg.collectionconfigurationdemo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "user_name")
	private String name;

	@ElementCollection
	@JoinTable(name = "addresses", joinColumns = @JoinColumn(name="user_id"))
	private Set<Address> addresses = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}


}
