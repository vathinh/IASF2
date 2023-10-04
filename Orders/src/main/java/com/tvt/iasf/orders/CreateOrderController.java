package com.tvt.iasf.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreateOrderController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/create-order")
    public String createOrderForm(Model model) {
        model.addAttribute("order", new Order());
        model.addAttribute("customers", customerRepository.findAll());
        return "create-order";
    }

    @PostMapping("/create-order")
    public String createOrderSubmit(@ModelAttribute Order order) {
        // Validate and save the order to the database
        orderRepository.save(order);
        // Redirect to a success page or the order list
        return "redirect:/order-list";
    }
}
