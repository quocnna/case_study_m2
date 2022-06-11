package view;

import util.CommonUtil;

public class HomeView {
    public static void main(String[] args) {
        displayHomeMenu();
    }

    public static void displayHomeMenu() {
        BookingView.show();
        backToHomeMenu();
    }
//        System.out.println("----- Welcome to Furama Resort -----\n" +
//                "1. Employee Management\n" +
//                "2. Customer Management\n" +
//                "3. Facility Management\n" +
//                "4. Booking Management\n" +
//                "5. Promotion Management\n" +
//                "6. Exit");
//
//        int choice= CommonUtil.getChoice();
//
//        switch (choice){
//            case 1:
//                EmployeeView.show();
//                break;
//            case 2:
//                CustomerView.show();
//                break;
//            case 3:
//                FacilityView.show();
//                break;
//            case 4:
//                BookingView.show();
//                break;
//            case 5:
//                PromotionView.show();
//                break;
//            case 6:
//                System.exit(0);
//        }
//
//        backToHomeMenu();
//    }
//
    private static void backToHomeMenu() {
        System.out.print("Do you back to main menu (Y/N): ");

        if (CommonUtil.getScanner().nextLine().equalsIgnoreCase("y")){
            displayHomeMenu();
        }
        else{
            System.exit(0);
        }
    }
}
