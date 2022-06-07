package view;

import controller.CustomerController;
import model.Customer;
import util.CommonUtil;
import util.ConstantUtil.TypeCustomer;
import util.ConstantUtil.Gender;

public class CustomerView {
    private static CustomerController customerController = new CustomerController();

    public static void show(){
        System.out.println("----- Customer View: ------\n"+
                "1. Display list customer\n"+
                "2. Add new customer\n"+
                "3. Edit customer\n"+
                "4. Return main menu");

        int choice= CommonUtil.getChoice();

        switch (choice) {
            case 1:
                customerController.findAll().forEach(System.out::println);
                break;
            case 2:
                String code = CommonUtil.inputTo("Code");
                Customer newCustomer = input();
                newCustomer.setCode(code);
                customerController.create(newCustomer);
                System.out.println("Create successfully...!");
                break;
            case 3:
                System.out.print("Input code to edit: ");
                String editCode = CommonUtil.getScanner().nextLine();
                Customer editCustomer = input();
                editCustomer.setCode(editCode);
                customerController.update(editCustomer);
                System.out.println("Update successfully...!");
                break;
            case 4:
                HomeView.displayHomeMenu();
        }
    }

    private static Customer input() {
        String fullName = CommonUtil.inputTo("FullName");
        String birthday = CommonUtil.inputTo("Birthday");
        String gender = CommonUtil.inputTo("Gender");
        String phone = CommonUtil.inputTo("Phone");
        String email = CommonUtil.inputTo("Email");
        String address = CommonUtil.inputTo("Address");
        String typeCustomer = CommonUtil.inputTo("Type Customer");

        return new Customer(fullName, birthday, Gender.valueOf(gender.toUpperCase()), phone, email, address, TypeCustomer.valueOf(typeCustomer.toUpperCase()));
    }
}
