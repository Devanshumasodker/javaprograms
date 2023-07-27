package Practiceleet;

import java.lang.annotation.Target;
import java.util.*;

public class LEEtco {

    public static HashMap<Integer,Integer>  freq(int []a){
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i : a) m.put(i,m.getOrDefault(i,0)+1);
        return m;
    }
    public static Boolean isPalll(String s,int i){
        // base case
HashMap<Integer,Integer> mmm = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
         //   mmm.put(s.charAt(i),mmm.getOrDefault(s.charAt(i),0)+1);
        }
        if(i==s.length()/2) return true;//raas
        // case 1

        if (s.charAt(i) != s.charAt((s.length() - 1)-i)) {
            return false;
       }
      return isPalll(s,i+1);

    }
    public static int[] recurrreversearr(int[]a,int i){
        // base case
      if (i==(a.length)/2) return a;
        // recurr
        int t = a[i];
        a[i] = a[(a.length-1)-i];
        a[(a.length-1)-i] = t;
        return recurrreversearr(a,i+1);
    }
    public static void Recurrprac(int n,int i){
        if(i<1) return ;

        Recurrprac(n,i-1);
        System.out.println(i);
        Recurrprac(n,i-1);
    }
    public static void rotate(int[][] matrix) {
int n = matrix.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                int t = matrix[i][j]; // int t = a; a = b ; b = t
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0,end = n-1;
            while (start<end){
                int t = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] =  t;
                start++;
                end--;

            }

        }
       // printmatrix(matrix);
    }
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1) ans+=4;
                if (grid[i][j]==1 &&grid[i][j-1]==1) ans-=2;
                if (grid[i][j]==1&& grid[i-1][j]==1) ans-=2;
            }
        }
return ans;
    }
    public static void printmatrix(int[][] matrix) {


    System.out.println("==============================");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int find_median(int[] v)
    {
        // 1 2 3 4
        Arrays.sort(v);
        if((v.length&1)!=0)
            return  (v[(v.length>>1)]);
        int a1 = v.length>>1;
        int a2 = v.length+1;
        System.out.println(v[a1]+" "+v[a1]);
         return (v[a1]+v[a1>>1])>>1;
        // Code here
    }
    public static void main(String[] args) {
        int[]a = {4,3,2,1};
        System.out.println(freq(a));
        System.out.println(isPalll("SabS",0));

    }

}
