import java.util.HashSet;
import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
String s1 = sc.nextLine();
        HashSet<Character> a = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            a.add(s.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!(a.contains(s1.charAt(i))))
                System.out.println(s1.charAt(i));
        }
    }
}
