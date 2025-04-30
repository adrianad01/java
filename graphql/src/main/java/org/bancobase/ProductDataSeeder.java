package org.bancobase;

import lombok.RequiredArgsConstructor;
import org.bancobase.entity.ProductEntity;
import org.bancobase.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProductDataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;

    public ProductDataSeeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        List<ProductEntity> products = List.of(
                new ProductEntity(UUID.fromString("e3159cf1-9127-4dcf-9a7f-12d1e93a9a01"), "Laptop", 1999.99),
                new ProductEntity(UUID.fromString("94ba38f5-69e3-4c0f-9437-f152c879d982"), "Monitor", 299.99),
                new ProductEntity(UUID.fromString("f418f51b-676e-4b53-bc8f-e5d15885819e"), "Teclado mecánico", 89.99)
        );

        productRepository.saveAll(products).subscribe(); // reactivo
    }
}
