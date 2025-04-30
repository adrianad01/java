package org.bancobase.resolver;

import org.bancobase.dto.Product;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductResolver {

    @QueryMapping
    public List<Product> products() {
        return List.of(
                new Product(UUID.randomUUID(), "Laptop", 1000.00),
                new Product(UUID.randomUUID(), "Monitor", 131123.12),
                new Product(UUID.randomUUID(), "Teclado", 123.32)
        );
    }
}
