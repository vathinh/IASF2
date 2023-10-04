package com.tvt.iasf.orders;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "customers")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String code;
    private String name;
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
}
