package com.miguel.springboot.reactbackendproducts.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.miguel.springboot.reactbackendproducts.entities.Product;

/* Implementación de crud automático */
@CrossOrigin(origins = "http://localhost:5173/")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
