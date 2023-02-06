package org.sid.billingservice.Repository;

import org.sid.billingservice.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {



}
