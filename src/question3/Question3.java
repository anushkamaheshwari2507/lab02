package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String arg[]) {
        int n1, n2;
        System.out.print("write two numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int n3 = n1 + n2;
        int n4 = n1 - n2;
        int n5 = n1 * n2;
        int n6 = n1 / n2;
        int n7 = n1 % n2;
        System.out.println(n1 + " + " + n2 + " = " + n3);
        System.out.println(n1 + " - " + n2 + " = " + n4);
        System.out.println(n1 + " * " + n2 + " = " + n5);
        System.out.println(n1 + " / " + n2 + " = " + n6);
        System.out.print(n1 + " % " + n2 + " = " + n7);
    }
}
