package org.ioof.illinois.lodge.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class PhoneType {
	@Id
	// defining id as column name
	@Column(name = "PHONE_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// defining PHONE_TYPE as column name
	@Column(name = "PHONE_TYPE_NAME", nullable = false, length = 50)
	private String phoneTypeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneTypeName() {
		return phoneTypeName;
	}
	public void setPhoneTypeName(String phoneTypeName) {
		this.phoneTypeName = phoneTypeName;
	}
	
}
