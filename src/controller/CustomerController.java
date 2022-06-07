package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    public void create(Customer e) {
        customerService.create(e);
    }

    public void update(Customer e) {
        customerService.update(e);
    }

    public List<Customer> findAll() {
        return customerService.findAll();
    }
}
