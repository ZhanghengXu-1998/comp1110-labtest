package comp1110.labtest;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
    }
}
