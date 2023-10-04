package com.tvt.iasf.orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
    Order findByCustomerCode(String customerCode);
}
