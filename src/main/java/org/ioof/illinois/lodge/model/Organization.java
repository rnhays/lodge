package org.ioof.illinois.lodge.model;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Organization {
	//mark id as primary key
	@Id
	//defining id as column name
	@Column(name="ORG_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//defining name as column name
	@Column(name="NAME", nullable=false, length=200)
	private String name;
	
	@ManyToOne
	protected Address address;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	protected Collection<Phone> phones;

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
    
}
