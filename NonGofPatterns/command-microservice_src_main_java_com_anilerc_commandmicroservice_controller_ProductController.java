package com.anilerc.commandmicroservice.controller;

import com.anilerc.commandmicroservice.dto.ProductDto;
import com.anilerc.commandmicroservice.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Void> addProduct(@Valid @RequestBody ProductDto productDto) {
        productService.addProduct(productDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
