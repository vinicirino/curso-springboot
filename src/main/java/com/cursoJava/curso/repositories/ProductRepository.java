package com.cursoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
