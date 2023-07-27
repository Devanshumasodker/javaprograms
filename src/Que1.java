import java.util.Scanner;

public class Que1 {
    public static int sumdigit(int n){
        int sum = 0;
        while (n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static int proddidgit(int n){
        int pro = 1;
        while (n>0){
            pro *= n%10;
            n/=10;
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
      //  if (proddidgit(num)==)
        System.out.println(proddidgit(num)+sumdigit(num)==num?"spec 2 dig numb": "not a spc num");
        //System.out.println(proddidgit(num));
       // System.out.println(sumdigit(num));

    }
}
