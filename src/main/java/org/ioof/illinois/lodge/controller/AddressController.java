package org.ioof.illinois.lodge.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.ioof.illinois.lodge.model.Address;
import org.ioof.illinois.lodge.service.AddressService;
//creating RestController
@RestController
public class AddressController {
	//autowired the AddressService class
	@Autowired
	AddressService addressService;
	//creating a get mapping that retrieves all the addresses detail from the database 
	@GetMapping("/address")
	private List<Address> getAllAddress() 
	{
	return addressService.getAllAddress();
	}
	//creating a get mapping that retrieves the detail of a specific address
	@GetMapping("/address/{id}")
	private Address getAddress(@PathVariable("id") int id) 
	{
	return addressService.getAddressById(id);
	}
	//creating a delete mapping that deletes a specific address
	@DeleteMapping("/address/{id}")
	private void deleteAddress(@PathVariable("id") int id) 
	{
	addressService.delete(id);
	}
	//creating post mapping that post the address detail in the database
	@PostMapping("/address")
	private int saveAddress(@RequestBody Address address) 
	{
	addressService.saveOrUpdate(address);
	return address.getId();
	}

}
