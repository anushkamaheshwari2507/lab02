package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String arg[]) {
        int n;
        System.out.print("enter the value ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.print("number is even");
        } else {
            System.out.print("number is odd");
        }
    }
}
