package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String arg[]) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine().trim();
        s2 = sc.nextLine().trim();
        sc.close();
        System.out.print("" + s1 + " University " + s2);

    }
}

