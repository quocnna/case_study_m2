package view;

import controller.PromotionController;
import model.Customer;
import util.CommonUtil;

import java.util.Map;

public class PromotionView {
    private static PromotionController promotionController = new PromotionController();

    public static void show() {
        System.out.println("----- Promotion View: ------\n" +
                "1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");

        int choice = CommonUtil.getChoice();

        switch (choice) {
            case 1:
                int year = Integer.parseInt(CommonUtil.inputTo("Input year to filter"));
                promotionController.getCustomerUseService(year).forEach(System.out::println);
                break;
            case 2:
                int amountOf10 = Integer.parseInt(CommonUtil.inputTo("Input amount 10% discount voucher"));
                int amountOf20 = Integer.parseInt(CommonUtil.inputTo("Input amount 20% discount voucher"));
                int amountOf50 = Integer.parseInt(CommonUtil.inputTo("Input amount 50% discount voucher"));
                Map<Customer, Integer> promotions = promotionController.getCustomerVoucher(amountOf10, amountOf20, amountOf50);

                for (Map.Entry<Customer, Integer> e : promotions.entrySet()) {
                    System.out.println(e.getKey());
                    System.out.printf("Voucher: %s discount\n", e.getValue()+ "%");
                    System.out.println("--------------------------");
                }
                break;
            case 3:
                HomeView.displayHomeMenu();
                break;
        }
    }
}
