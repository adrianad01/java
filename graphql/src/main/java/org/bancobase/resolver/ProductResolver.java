package org.bancobase.resolver;

import lombok.RequiredArgsConstructor;
import org.bancobase.dto.Product;
import org.bancobase.entity.ProductEntity;
import org.bancobase.service.ProductService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductResolver {

    private final ProductService productService;

    public ProductResolver(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public Flux<ProductEntity> products() {
        return productService.getAllProducts();
    }
}
