package view;

import util.CommonUtil;

public class BookingView {
    public static void show(){
        System.out.println("----- Booking View: ------\n"+
                "1. Add new booking\n"+
                "2. Display list booking\n"+
                "3. Create new constracts\n"+
                "4. Display list contracts\n"+
                "5. Edit contracts\n"+
                "6. Return main menu");

        int choice= CommonUtil.getChoice();
    }
}
