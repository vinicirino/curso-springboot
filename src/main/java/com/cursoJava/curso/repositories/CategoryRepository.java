package com.cursoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
