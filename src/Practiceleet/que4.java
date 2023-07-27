package Practiceleet;

import java.util.Arrays;
import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int k =0;
        int []a = new int[l];
        int []b = new int[l];
        for (int i = 0; i <l ; i++) {
            a[i]= s.nextInt();
        }
        for (int i = 0; i < l; i++) {
            if (a[i]!=0) b[k++]= a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
