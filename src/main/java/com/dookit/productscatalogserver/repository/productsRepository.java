package com.dookit.productscatalogserver.repository;

import com.dookit.productscatalogserver.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface productsRepository extends JpaRepository<Product, UUID> {
}
