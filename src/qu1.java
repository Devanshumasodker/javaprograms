import java.util.Arrays;
import java.util.Scanner;

public class qu1 {
    // que 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l  = sc.nextInt();
        int [] arr = new int[l];//0 1 2
        for (int i = 0; i < l; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(que1(arr));

    }
    public static int que1(int []nums){
        Arrays.sort(nums);
        int c = nums.length;
        for (int i = 0; i <nums.length ; i++) {
            //int cuur = ;
            if (nums[i]!= i) return i;

        }
        return c;
    }
}
