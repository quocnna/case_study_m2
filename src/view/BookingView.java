package view;

import controller.BookingController;
import controller.ContractController;
import controller.CustomerController;
import controller.FacilityController;
import model.Booking;
import model.Contract;
import util.CommonUtil;

import java.time.LocalDate;
import java.util.List;

public class BookingView {
    private static BookingController bookingController = new BookingController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static ContractController contractController = new ContractController();

    public static void show() {
        System.out.println("----- Booking View: ------\n" +
                "1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");

        int choice = CommonUtil.getChoice();

        switch (choice) {
            case 1:
                System.out.println("----- List customer ---");
                customerController.findAll().forEach(System.out::println);
                String customerCode = CommonUtil.inputTo("Enter customer code to booking");
                System.out.println("----- List service ---");
                facilityController.findAll().forEach(System.out::println);
                String serviceCode = CommonUtil.inputTo("Enter service code to booking");
                String bookingCode = CommonUtil.inputTo("Booking Code");
                String stStartDate = CommonUtil.inputTo("Start Date");
                LocalDate startDate = LocalDate.parse(stStartDate, CommonUtil.getDateFormat());
                String stEndDate = CommonUtil.inputTo("End Date");
                LocalDate endDate = LocalDate.parse(stEndDate, CommonUtil.getDateFormat());
                Booking booking = new Booking(bookingCode, startDate, endDate, customerCode, serviceCode);
                bookingController.create(booking);
                System.out.println("Booking successfully!");
                break;
            case 2:
                bookingController.findAll().forEach(System.out::println);
                break;
            case 3:
                List<Booking> bookings = bookingController.findAll();
                int size = bookings.size();
                for (int i = size - 1; i >= 0; i--) {
                    Booking tmp = bookings.get(i);
                    if (!tmp.isContract()) {
                        String bookCode = tmp.getCode();
                        String cusCode = tmp.getCustomerCode();
                        System.out.println("Please create contract for " + bookCode);
                        String code = CommonUtil.inputTo("Contract Code");
                        double down = Double.parseDouble(CommonUtil.inputTo("Down Payment"));
                        double total = Double.parseDouble(CommonUtil.inputTo("Total Payment"));

                        Contract contract = new Contract(code, tmp.getCode(), down, total, cusCode);
                        contractController.create(contract);
                        tmp.setContract(true);
                        System.out.println("Created successful for " + bookCode);
                        System.out.println("--------------------");
                    }
                }

                System.out.println("No Bookings for create contract");
                break;
            case 4:
                contractController.findAll().forEach(System.out::println);
                break;
            case 5:
                System.out.println("----- List contract ---");
                contractController.findAll().forEach(System.out::println);
                String code = CommonUtil.inputTo("Enter contract code to edit");
                double down = Double.parseDouble(CommonUtil.inputTo("Down Payment"));
                double total = Double.parseDouble(CommonUtil.inputTo("Total Payment"));
                System.out.println("----- List customer ---");
                customerController.findAll().forEach(System.out::println);
                String cusCode = CommonUtil.inputTo("Enter customer code to booking");
                System.out.println("----- List booking ---");
                bookingController.findAll().forEach(System.out::println);
                String bookCode = CommonUtil.inputTo("Enter booking code to edit");
                Contract contract = new Contract(code, bookCode, down, total, cusCode);
                contractController.update(contract);
                System.out.println("Updated successfully!");
                break;
            case 6:
                HomeView.displayHomeMenu();
                break;
        }
    }
}
