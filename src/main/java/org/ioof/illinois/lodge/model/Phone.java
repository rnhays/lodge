package org.ioof.illinois.lodge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Phone {

	@Any(metaColumn = @Column(name = "ITEM_TYPE"))
	@AnyMetaDef(idType = "long", metaType = "string", metaValues = {
			@MetaValue(targetEntity = Person.class, value = "PERSON"),
			@MetaValue(targetEntity = Organization.class, value = "Organization") })
	@JoinColumn(name = "ITEM_ID")
	private Object item;
	
	@Id
	// defining id as column name
	@Column(name = "PHONE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// defining PHONE_NUMBER as column name
	@Column(name = "PHONE_NUMBER", nullable = false, length = 7)
	private String phoneNumber;
	// defining AREA_CODE as column name
	@Column(name = "AREA_CODE", nullable = false, length = 3)
	private String areaCode;
	@Column(name = "EXTENSION", length = 10)
	private String extension;
	@ManyToOne
	protected PhoneType phoneType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

}
