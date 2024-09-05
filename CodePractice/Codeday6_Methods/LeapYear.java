package CodePractice.Codeday6_Methods;

import java.util.*;

public class LeapYear {

    public static boolean isLeap(int year) {
        if (year % 100 != 0 && (year % 4 == 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int y = sc.nextInt();
        System.out.println(isLeap(y));
        sc.close();
    }

}