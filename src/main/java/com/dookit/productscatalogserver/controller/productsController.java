package com.dookit.productscatalogserver.controller;

import com.dookit.productscatalogserver.domain.Product;
import com.dookit.productscatalogserver.service.productsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/products")
public class productsController {

    @Autowired
    private productsService service;

    @GetMapping
    public ResponseEntity<Object> getAllProducts(){
        return ResponseEntity.ok(service.getAllProducts());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Object> getProductByUUID(@PathVariable("uuid") UUID uuid){
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<Object> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(service.saveProduct(product));
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("uuid") UUID productId){
        service.deleteProduct(productId);
        return ResponseEntity.ok("Producto Eliminado correctamente");
    }

}
