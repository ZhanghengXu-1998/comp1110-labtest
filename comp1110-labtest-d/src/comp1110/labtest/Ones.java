package comp1110.labtest;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int i = in.nextInt();
        String s = Integer.toBinaryString(i);
        int c = 0;
        for(int a =0; a<s.length(); a++){
            if(s.charAt(a)=='1')
                c++;
        }
        System.out.println(c);
    }
}
