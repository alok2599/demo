package com.test.controller.product;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.model.Product;
import com.test.dao.repository.ProductRepository;
import com.test.dto.ProductDTO;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping(path = "/add")
	public ProductDTO add(@RequestBody ProductDTO productDto) {
		logger.info("Adding a new product:"+productDto.getProductName());
		Product product = modelMapper.map(productDto, Product.class);
		productRepository.save(product);
		logger.info("Saved a new product:"+productDto.getProductName());
		return productDto;
	}
	
	@PostMapping(path = "/update")
	public ProductDTO update(@RequestBody ProductDTO productDto) {
		Product product =  modelMapper.map(productDto, Product.class);
		product.setId(productRepository.findByProductCode(productDto.getProductCode()).getId());
		productRepository.save(product);
		logger.info("Updated product:"+productDto.getProductCode());
		
		return productDto;
	}
	
	@GetMapping(path = "/remove/{id}")
	public ProductDTO remove(@PathVariable("id") int id) {
		return null;
	}
	
	//increase quantity by one
	@GetMapping(path = "/increase/{id}")
	public Map<String, Boolean> increase( @PathVariable("quantity") int id) {
		return Collections.singletonMap("success", true);
	}
	
	@GetMapping(path = "/increase/{id}/{quantity}")
	public Map<String, Boolean> increase( @PathVariable("id") int id, @PathVariable("quantity") int quantity) {
		return Collections.singletonMap("success", true);
	}
	
	@GetMapping(path = "/decrease/{id}")
	public Map<String, Boolean> decrease( @PathVariable("id") int id) {
		return Collections.singletonMap("success", true);
	}
	
	@GetMapping(path = "/decrease/{id}/{quantity}")
	public Map<String, Boolean> decrease( @PathVariable("id") int id, @PathVariable("quantity") int quantity) {
		return Collections.singletonMap("success", true);
	}
	@GetMapping(path = "/list/all")
	public List<ProductDTO> list() {
		return null;
	}
	
	@GetMapping(path = "/list/{id}")
	public ProductDTO list(@PathVariable("id") int id) {
		return null; //return stmt
	}
	
	
}
