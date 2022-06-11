package util;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommonUtil {
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static int getChoice(){
        System.out.print("Enter your choice: ");
        return Integer.parseInt(CommonUtil.getScanner().nextLine());
    }

    public static String inputTo(String field){
        System.out.print(field+ ": ");
        return getScanner().nextLine();
    }

    public static DateTimeFormatter getDateFormat() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
}
