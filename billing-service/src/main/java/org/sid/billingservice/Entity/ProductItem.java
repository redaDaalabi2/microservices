package org.sid.billingservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.Model.Product;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double price;
    private double discount;
    //ne pas créer customer dans la base de donnée
    @Transient
    private Product product;

}
