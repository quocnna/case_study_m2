package view;

import util.CommonUtil;

public class EmployeeView {
    public static void show(){
            System.out.println("----- Employee View: ------\n"+
                    "1. Display list employees\n"+
                    "2. Add new employee\n"+
                    "3. Edit employee\n"+
                    "4. Return main menu");

        int choice= CommonUtil.getChoice();
    }
}
