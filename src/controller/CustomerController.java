package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    public void create(Customer customer) {
        customerService.create(customer);
    }

    public void update(Customer customer) {
        customerService.update(customer);
    }

    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
