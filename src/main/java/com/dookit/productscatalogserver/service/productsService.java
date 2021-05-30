package com.dookit.productscatalogserver.service;

import com.dookit.productscatalogserver.domain.Product;
import com.dookit.productscatalogserver.repository.productsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class productsService {
    @Autowired
    private productsRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();
    }
    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public void deleteProduct(UUID productUUID){
        repository.deleteById(productUUID);
    }

}
