package net.codeJava.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codeJava.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
