package com.miguel.springboot.reactbackendproducts.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.miguel.springboot.reactbackendproducts.entities.Product;

/* Implementación de crud automático */
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
