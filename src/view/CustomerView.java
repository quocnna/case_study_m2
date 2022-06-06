package view;

import util.CommonUtil;

public class CustomerView {
    public static void show(){
        System.out.println("----- Customer View: ------\n"+
                "1. Display list customer\n"+
                "2. Add new customer\n"+
                "3. Edit customer\n"+
                "4. Return main menu");

        int choice= CommonUtil.getChoice();
    }
}
