package org.sid.billingservice.Repository;

import org.sid.billingservice.Entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {



}
