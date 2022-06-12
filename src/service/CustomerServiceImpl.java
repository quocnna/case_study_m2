package service;

import model.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import util.ConstantUtil.Gender;
import util.ConstantUtil.TypeCustomer;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customers = new LinkedList<>();

    static {
        customers.add(new Customer("C1", "Phong Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "phongnna@gmail.com", "19 Le Do", TypeCustomer.SILVER));

        customers.add(new Customer("C2", "Quoc Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "phongnna@gmail.com", "19 Le Do", TypeCustomer.GOLD));

        customers.add(new Customer("C3", "Dung Nguyen", "23/09/1984", Gender.MALE, "0708230984",
                "phongnna@gmail.com", "19 Le Do", TypeCustomer.PLATINUM));
    }

    @Override
    public void create(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void update(Customer customer) {
        int index = customers.indexOf(customer);
        customers.set(index, customer);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Optional<Customer> get(String code) {
        return customers.stream().filter(e-> e.getCode().equals(code)).findFirst();
    }
}
