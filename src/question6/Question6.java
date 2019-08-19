package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String arg[]) {
        char c1, c2;
        System.out.print("enter the two character");
        Scanner sc = new Scanner(System.in);
        c1 = sc.nextLine().charAt(0);
        c2 = sc.nextLine().charAt(0);
        if (c1 - c2 > 0) {
            System.out.print("" + c2 + " " + c1);
        } else {
            System.out.print("" + c1 + "  " + c2);
        }
    }

}
