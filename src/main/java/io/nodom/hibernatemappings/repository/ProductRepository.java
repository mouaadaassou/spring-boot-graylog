package io.nodom.hibernatemappings.repository;

import io.nodom.hibernatemappings.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
