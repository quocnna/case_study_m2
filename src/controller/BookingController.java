package controller;

import model.Booking;
import service.BookingService;
import service.BookingServiceImpl;

import java.util.List;

public class BookingController {
    private BookingService bookingService = new BookingServiceImpl();

    public void create(Booking booking){
        bookingService.create(booking);
    }

    public List<Booking> findAll(){
        return bookingService.findAll();
    }
}
