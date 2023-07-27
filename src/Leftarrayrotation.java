import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Leftarrayrotation {
public static int    ans (int a[]){
    HashSet<Integer> m = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
        m.add(a[i]);
    }
   if ((a.length/2)<m.size()) return a.length/2;
   return m.size();

}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int l = s.nextInt();
            int []a = new int[l];
        for (int i = 0; i < l ; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(ans(a));

    }
}
