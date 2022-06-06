package util;

import java.util.Scanner;

public class CommonUtil {
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static int getChoice(){
        System.out.print("Enter your choice: ");
        return CommonUtil.getScanner().nextInt();
    }
}
