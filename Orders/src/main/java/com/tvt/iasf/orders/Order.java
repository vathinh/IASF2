package com.tvt.iasf.orders;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "orders")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ordersDate;
    private String productName;
    private int price;
    private int quantity;

    @ManyToOne
    private Customer customer;
}
