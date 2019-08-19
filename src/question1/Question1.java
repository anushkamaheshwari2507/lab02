package question1;

import java.util.Scanner;
public class Question1 {
    public static void main(String arg[]) {
        String s;
        System.out.print("write a string");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();
        System.out.print("Welcome, " + s + "!");
    }
}

