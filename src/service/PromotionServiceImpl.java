package service;

import model.Booking;
import model.Customer;
import util.ConstantUtil.PROMOTION;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PromotionServiceImpl implements PromotionService{
    private BookingService bookingService= new BookingServiceImpl();
    private CustomerService customerService= new CustomerServiceImpl();

    @Override
    public List<Booking> getCustomerUseService(int year) {
        return bookingService.findAll().stream().filter(e-> e.getStartDate().getYear()== year).collect(Collectors.toList());
    }

    @Override
    public Map<Customer, Integer> getCustomerVoucher(int amountOf10, int amountOf20, int amountOf50) {
        Map<Customer, Integer> res= new LinkedHashMap<>();
        LocalDate now= LocalDate.now();

        //qg way1: use Stack, every customer just get only 1 voucher
/*        Stack<Booking> stackBookings= new Stack<>();
        bookingService.findAll().stream().filter(e -> e.getStartDate().getYear() == now.getYear()
        && e.getStartDate().getMonthValue() == now.getMonthValue()).forEach(f -> stackBookings.add(f));

        for (int i = 0; i < amountOf50 && !stackBookings.isEmpty(); i++) {
            Customer customer = customerService.get(stackBookings.pop().getCustomerCode()).get();
            if(!res.containsKey(customer)){
                res.put( customer, PROMOTION.FIFTY_PERCENT);
            }
            else{
                i--;
            }
        }

        for (int i = 0; i < amountOf20 && !stackBookings.isEmpty(); i++) {
            Customer customer = customerService.get(stackBookings.pop().getCustomerCode()).get();
            if(!res.containsKey(customer)){
                res.put( customer, PROMOTION.TWENTY_PERCENT);
            }
            else{
                i--;
            }
        }

        for (int i = 0; i < amountOf10 && !stackBookings.isEmpty(); i++) {
            Customer customer = customerService.get(stackBookings.pop().getCustomerCode()).get();
            if(!res.containsKey(customer)){
                res.put( customer, PROMOTION.TEN_PERCENT);
            }
            else{
                i--;
            }
        }*/

        //qg way2: not use stack
        List<Booking> bookings = bookingService.findAll().stream().filter(e -> e.getStartDate().getYear() == now.getYear()
                && e.getStartDate().getMonthValue() == now.getMonthValue()).collect(Collectors.toList());

        for (int i = bookings.size() -1; i > 0; i--) {
            Customer customer = customerService.get(bookings.get(i).getCustomerCode()).get();
            if(res.size() < amountOf50){
                if(!res.containsKey(customer)){
                    res.put( customer, PROMOTION.FIFTY_PERCENT);
                }
            }
            else if(res.size() < amountOf50 + amountOf20){
                if(!res.containsKey(customer)){
                    res.put( customer, PROMOTION.TWENTY_PERCENT);
                }
            }
            else if(res.size() < amountOf50 + amountOf20 + amountOf10){
                if(!res.containsKey(customer)){
                    res.put( customer, PROMOTION.TEN_PERCENT);
                }
            }
        }

        return res;
    }
}
