package service;

import model.Customer;

import java.util.Optional;

public interface CustomerService extends BaseService<Customer> {
    Optional<Customer> get(String code);
}
