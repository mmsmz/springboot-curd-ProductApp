package net.codeJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import net.codeJava.model.Product;
import net.codeJava.repos.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository proRepository;
	
	public List<Product> listallProduct(){
		return proRepository.findAll();
	}
	
	public void saveProduct(Product product) {
		proRepository.save(product);
	}
	
	public Product getProduct(long id) {
		return proRepository.findById(id).get();
	}
	
	public void deleteProduct(Long id) {
		proRepository.deleteById(id);
	}
}
