package com.cursoJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
