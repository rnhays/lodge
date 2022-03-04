package org.ioof.illinois.lodge.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ioof.illinois.lodge.model.Organization;
import org.ioof.illinois.lodge.repository.OrganizationRepository;
//defining the business logic
@Service
public class OrganizationService {
	@Autowired
	OrganizationRepository organizationRepository;
	//getting all Organization records
	public List<Organization> getAllOrganization() 
	{
	List<Organization> organizations = new ArrayList<Organization>();
	organizationRepository.findAll().forEach(organization -> organizations.add(organization));
	return organizations;
	}
	//getting a specific record
	public Organization getOrganizationById(int id) 
	{
	return organizationRepository.findById(id).get();
	}
	public void saveOrUpdate(Organization organization) 
	{
	organizationRepository.save(organization);
	}
	//deleting a specific record
	public void delete(int id) 
	{
	organizationRepository.deleteById(id);
	}

}
