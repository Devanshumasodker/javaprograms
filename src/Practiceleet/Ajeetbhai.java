package Practiceleet;

import java.util.Arrays;
import java.util.Scanner;

public class Ajeetbhai {
    public static void main(String[] args) {
        Scanner Java_undernumconspiracy = new Scanner(System.in);
        System.out.println("apni pasand ka input daalo bhai");
        String j = Java_undernumconspiracy.nextLine(),klo= Java_undernumconspiracy.nextLine();

        StringBuilder l = new StringBuilder(j);
        StringBuilder you = new StringBuilder(klo);
        int n1 =  Integer.parseInt(l.reverse().toString()),
                n2=Integer.parseInt(you.reverse().toString());
        int []a = new int[(int) Math.log10(n1)+1];
        int []b = new int[(int) Math.log10(n1)+1];
        System.out.println( (int) Math.log10(n1)+1);
        int ab1 = n1,ab2 = n2;

        for (int i = 0; i < ((int)Math.log10(n1)+1); i++) {
            a[i]= ab1%10;

            b[i]= ab2%10;
            ab1/=10;
            ab2/=10;



        }
       // System.out.println(Arrays.toString(a));        System.out.println(Arrays.toString(b));


        String s = ""; int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i==a.length-1)  s+= (a[i]+b[i]+sum);

           // int t = a[i]+b[i];
          else {
                s += (a[i] + b[i] + sum) % 10;
                sum = 0;
                sum = (a[i] + b[i]) / 10;
            }


        }
        System.out.println(s);
       // return Integer.parseInt(ans);
    }
}
