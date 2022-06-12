package service;

import model.Booking;
import model.Facility;
import util.CommonUtil;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BookingServiceImpl implements BookingService {
    private static TreeSet<Booking> bookings = new TreeSet<>();
    private FacilityService facilityService = new FacilityServiceImpl();

    static {
        LocalDate startDate = LocalDate.parse("07/06/2022", CommonUtil.getDateFormat());
        LocalDate endDate = LocalDate.parse("23/09/2022", CommonUtil.getDateFormat());
        bookings.add(new Booking("BOK7", startDate, endDate, "C1", "VIL1"));

        bookings.add(new Booking("BOK6", LocalDate.parse("06/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C3", "VIL1"));

        bookings.add(new Booking("BOK5", LocalDate.parse("05/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C3", "VIL1"));

        bookings.add(new Booking("BOK4", LocalDate.parse("04/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C3", "VIL1"));

        bookings.add(new Booking("BOK3", LocalDate.parse("03/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C2", "VIL1"));

        bookings.add(new Booking("BOK2", LocalDate.parse("02/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C1", "VIL1"));

        bookings.add(new Booking("BOK1", LocalDate.parse("01/06/2022", CommonUtil.getDateFormat())
                , LocalDate.parse("23/09/2022", CommonUtil.getDateFormat()), "C1", "VIL1"));
    }

    @Override
    public void create(Booking booking) {
        bookings.add(booking);

        Optional<Facility> optionalFacility = facilityService.get(booking.getFacilityCode());
        if (optionalFacility.isPresent()) {
            Map<Facility, Integer> tmp = facilityService.findAllMaintenance();
            tmp.put(optionalFacility.get(), tmp.get(optionalFacility.get()) + 1);
        }
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public List<Booking> findAll() {
        return bookings.stream().collect(Collectors.toList());
    }
}
