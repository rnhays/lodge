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
public class Address 
{
	 @Any(metaColumn = @Column(name = "ITEM_TYPE"))
	    @AnyMetaDef(idType = "long", metaType = "string",
	            metaValues = {
	                    @MetaValue(targetEntity = Person.class, value = "PERSON"),
	                    @MetaValue(targetEntity = Organization.class, value = "Organization")
	            })
	    @JoinColumn(name="ITEM_ID")
	    private Object item;
//mark id as primary key
@Id
//defining id as column name
@Column(name="ADDRESS_ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
//defining street_address_1 as column name
@Column(name="STREET_ADDRESS_1", nullable=false, length=200)
private String streetAddress1;
//defining STREET_ADDRESS_2 as column name
@Column(name="STREET_ADDRESS_2", length=200)
private String streetAddress2;
//defining city as column name
@Column(name="CITY", nullable=false, length=90)
private String city;
@Column(name="STATE", nullable=false, length=2)
private String state;
@Column(name="ZIP", nullable=false, length=10)
private String zip;


public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
/**
 * @return the streetAddress1
 */
public String getStreetAddress1() {
	return streetAddress1;
}
/**
 * @param streetAddress1 the streetAddress1 to set
 */
public void setStreetAddress1(String streetAddress1) {
	this.streetAddress1 = streetAddress1;
}
/**
 * @return the streetAddress2
 */
public String getStreetAddress2() {
	return streetAddress2;
}
/**
 * @param streetAddress2 the streetAddress2 to set
 */
public void setStreetAddress2(String streetAddress2) {
	this.streetAddress2 = streetAddress2;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zip
 */
public String getZip() {
	return zip;
}
/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}

}