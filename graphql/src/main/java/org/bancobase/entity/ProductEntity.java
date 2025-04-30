package org.bancobase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@Table("product")
@NoArgsConstructor
public class ProductEntity {
    @Id
    private UUID id;
    private String name;
    private double price;

    public ProductEntity(UUID id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
