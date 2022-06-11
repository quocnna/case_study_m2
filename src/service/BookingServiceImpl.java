package service;

import model.Booking;
import model.Facility;
import util.CommonUtil;

import java.time.LocalDate;
import java.util.*;

public class BookingServiceImpl implements BookingService{
    private static TreeSet<Booking> bookings= new TreeSet<>();
    private FacilityService facilityService = new FacilityServiceImpl();

    static {
        LocalDate startDate= LocalDate.parse("01/01/2021", CommonUtil.getDateFormat());
        LocalDate endDate= LocalDate.parse("23/09/2022", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK01", startDate , endDate,"C1", "VIL1"));
    }

    @Override
    public void create(Booking booking) {
        bookings.add(booking);

        Optional<Facility> optionalFacility= facilityService.get(booking.getFacilityCode());
        if(optionalFacility.isPresent()){
            Map<Facility, Integer> tmp= facilityService.findAllMaintenance();
            tmp.put(optionalFacility.get(), tmp.get(optionalFacility.get())+1);
        }
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public List<Booking> findAll() {
        return bookings.stream().toList();
    }
}
