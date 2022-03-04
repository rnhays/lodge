/**
 * 
 */
package org.ioof.illinois.lodge.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ioof.illinois.lodge.model.Address;
import org.ioof.illinois.lodge.repository.AddressRepository;
//defining the business logic
@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	//getting all Person records
	public List<Address> getAllAddress() 
	{
		List<Address> addresses = new ArrayList<Address>();
		addressRepository.findAll().forEach(address -> addresses.add(address));
		return addresses;
	}
	//getting a specific record
	public Address getAddressById(int id) 
	{
		return addressRepository.findById(id).get();
	}
	public void saveOrUpdate(Address address) 
	{
		addressRepository.save(address);
	}
	//deleting a specific record
	public void delete(int id) 
	{
		addressRepository.deleteById(id);
	}
}
