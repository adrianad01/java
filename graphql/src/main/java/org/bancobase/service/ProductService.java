package org.bancobase.service;

import lombok.RequiredArgsConstructor;
import org.bancobase.entity.ProductEntity;
import org.bancobase.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
