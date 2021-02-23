package org.sid.billingservice.repository;

import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface BillRepository extends JpaRepository<Bill,Long> {

}
