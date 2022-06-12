package service;

import model.Booking;
import model.Customer;

import java.util.List;
import java.util.Map;

public interface PromotionService {
    List<Booking> getCustomerUseService(int year);
    Map<Customer, Integer> getCustomerVoucher(int amountOf10, int amountOf20, int amountOf50);
}
