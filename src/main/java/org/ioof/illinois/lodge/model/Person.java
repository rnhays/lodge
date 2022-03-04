package org.ioof.illinois.lodge.model;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Person 
{
//mark id as primary key
@Id
//defining id as column name
@Column(name="PERSON_ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
//defining first_name as column name
@Column(name="first_name", nullable=false, length=40)
private String firstName;
//defining last_name as column name
@Column(name="last_name", nullable=false, length=50)
private String lastName;
//defining middle_init as column name
@Column(name="middle_init", length=1)
private String middleInit;

public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getFirstName() 
{
return firstName;
}
public void setFirstName(String firstName) 
{
this.firstName = firstName;
}
public String getLastName() 
{
return lastName;
}
public void setlastName(String lastName) 
{
this.lastName = lastName;
}
public String getMiddleInit() 
{
return middleInit;
}
public void setMiddleInit(String middleInit) 
{
this.middleInit = middleInit;
}
/**
 * @return the addresses
 */
public Collection<Address> getAddresses() {
	return addresses;
}
/**
 * @param addresses the addresses to set
 */
public void setAddresses(Collection<Address> addresses) {
	this.addresses = addresses;
}
@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
protected Collection<Address> addresses;

}