package org.ioof.illinois.lodge.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.ioof.illinois.lodge.model.Organization;
import org.ioof.illinois.lodge.model.Organization;
import org.ioof.illinois.lodge.service.OrganizationService;
import org.ioof.illinois.lodge.service.OrganizationService;

//creating RestController
@RestController
public class OrganizationController {
	// autowired the OrganizationService class
	@Autowired
	OrganizationService organizationService;

	// creating a get mapping that retrieves all the organizations detail from the
	// database
	@GetMapping("/organization")
	private List<Organization> getAllOrganization() {
		return organizationService.getAllOrganization();
	}

	// creating a get mapping that retrieves the detail of a specific organization
	@GetMapping("/organization/{id}")
	private Organization getOrganization(@PathVariable("id") int id) {
		return organizationService.getOrganizationById(id);
	}

	// creating a delete mapping that deletes a specific organization
	@DeleteMapping("/organization/{id}")
	private void deleteOrganization(@PathVariable("id") int id) {
		organizationService.delete(id);
	}

	// creating post mapping that post the organization detail in the database
	@PostMapping("/organization")
	private int saveOrganization(@RequestBody Organization organization) {
		organizationService.saveOrUpdate(organization);
		return organization.getId();
	}
}
