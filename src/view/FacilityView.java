package view;

import util.CommonUtil;

public class FacilityView {
    public static void show(){
        System.out.println("----- Facility View: ------\n"+
                "1. Display list facility\n"+
                "2. Add new facility\n"+
                "3. Display list facility maintenance\n"+
                "4. Return main menu");

        int choice= CommonUtil.getChoice();
    }
}
