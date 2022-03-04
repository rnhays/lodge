package org.ioof.illinois.lodge.repository;
import org.springframework.data.repository.CrudRepository;
import org.ioof.illinois.lodge.model.Organization;
public interface OrganizationRepository extends CrudRepository<Organization, Integer> {
}