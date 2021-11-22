package com.cmayorga.quarkus.repositories;

import com.cmayorga.quarkus.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
