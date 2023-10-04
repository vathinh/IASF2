package com.tvt.iasf.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderListController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/order-list")
    public String orderList(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        model.addAttribute("customers", customerRepository.findAll());
        return "order-list";
    }

    @PostMapping("/filter-orders")
    public String filterOrders(@RequestParam String customerCode, Model model) {
        // Implement filtering logic based on the selected customerCode
        model.addAttribute("orders", orderRepository.findByCustomerCode(customerCode));
        // Set filtered orders in the model
        return "order-list";
    }
}
