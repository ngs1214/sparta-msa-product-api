package com.seung.product_api.domain.repository;

import com.seung.product_api.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
