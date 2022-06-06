package view;

import controller.EmployeeController;
import model.Employee;
import util.CommonUtil;
import util.ConstantUtil.Gender;
import util.ConstantUtil.Degree;
import util.ConstantUtil.Position;

public class EmployeeView {
    private static EmployeeController employeeController = new EmployeeController();

    public static void show() {
        System.out.println("----- Employee View: ------\n" +
                "1. Display list employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Return main menu");

        int choice = CommonUtil.getChoice();

        switch (choice) {
            case 1:
                employeeController.findAll().forEach(System.out::println);
                break;
            case 2:
                String code = CommonUtil.inputTo("Code");
                Employee newEmployee = input();
                newEmployee.setCode(code);
                employeeController.create(newEmployee);
                System.out.println("Create successfully...!");
                break;
            case 3:
                System.out.print("Input code to edit: ");
                String editCode = CommonUtil.getScanner().nextLine();
                Employee editEmployee = input();
                editEmployee.setCode(editCode);
                employeeController.update(editEmployee);
                System.out.println("Update successfully...!");
                break;
            case 4:
                HomeView.displayHomeMenu();
        }
    }

    private static Employee input() {
        String fullName = CommonUtil.inputTo("FullName");
        String birthday = CommonUtil.inputTo("Birthday");
        String gender = CommonUtil.inputTo("Gender");
        String phone = CommonUtil.inputTo("Phone");
        String email = CommonUtil.inputTo("Email");
        String address = CommonUtil.inputTo("Address");
        String degree = CommonUtil.inputTo("Degree");
        String position = CommonUtil.inputTo("Position");
        double salary = Double.parseDouble(CommonUtil.inputTo("Salary"));
        return new Employee("", fullName, birthday, Gender.valueOf(gender.toUpperCase()), phone, email, address, Degree.valueOf(degree.toUpperCase()), Position.valueOf(position.toUpperCase()), salary);
    }
}
