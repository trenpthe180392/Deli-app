package edu.mo.coffee.fooddelivery.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurants")
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    private String name;
    private String address;
    private String openingHours;
    private Double rating;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
