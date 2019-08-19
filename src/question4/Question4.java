package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String arg[]) {
        int n;
        System.out.print("enter the value");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n > 0) {
            System.out.print("number is positive");
        } else if (n < 0) {
            System.out.print("number is negative");
        } else {
            System.out.print("zero");
        }
    }
}

