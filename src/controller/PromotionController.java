package controller;

import model.Booking;
import model.Customer;
import service.PromotionService;
import service.PromotionServiceImpl;

import java.util.List;
import java.util.Map;

public class PromotionController {
    private PromotionService promotionService= new PromotionServiceImpl();

    public List<Booking> getCustomerUseService(int year){
        return promotionService.getCustomerUseService(year);
    }

    public Map<Customer, Integer> getCustomerVoucher(int amountOf10, int amountOf20, int amountOf50){
        return promotionService.getCustomerVoucher(amountOf10, amountOf20, amountOf50);
    }
}
