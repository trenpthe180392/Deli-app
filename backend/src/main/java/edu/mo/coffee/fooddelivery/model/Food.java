package edu.mo.coffee.fooddelivery.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Foods")
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;

    private String name;
    private Double price;
    private String description;
    private String imageUrl;
    private Boolean isAvailable = true;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
