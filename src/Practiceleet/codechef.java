package Practiceleet;

import java.util.ArrayList;
import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while (t-->0){
            ArrayList<Character> chaRRR = new ArrayList<>();
            chaRRR.add('a'); chaRRR.add('e'); chaRRR.add('i'); chaRRR.add('o'); chaRRR.add('u');

            int c = 0;
            int l = s.nextInt();
            String lll = s.nextLine();
            for (int i = 0; i < lll.length(); i++) {
                if (!(chaRRR.contains(lll.charAt(i)))) c++;
            }
            System.out.println(c>=4 ? "no":"yes");


        }

    }
}
