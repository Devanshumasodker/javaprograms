import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st num");
        int n = sc.nextInt();
        System.out.println("enter 2nd num");
        int m = sc.nextInt();
        int sum1=0,s2= 0;
        for (int i = 1; i <= m; i++) {
            if (i%n==0) sum1+=i;
            else if (i%n!=0) { s2+=i;

            }

        }
        System.out.println(Math.abs(sum1-s2));
       //4 System.out.println(sum1);
       // System.out.println(s2);
    }
}
