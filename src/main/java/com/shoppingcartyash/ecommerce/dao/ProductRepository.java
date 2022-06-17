package com.shoppingcartyash.ecommerce.dao;

import com.shoppingcartyash.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {
}
