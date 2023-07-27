package Practiceleet;

import java.util.*;

public class GFG {
	
	//function to find where the bit is set
	public static String print(String s , int i){
		
		int j = 0;
		String sub = "";
		
		//finding the bit is set
		while(i>0){
			if((i & 1) == 1){
				sub += s.charAt(j);
			}
			j++;
			i = i>>1;
		}
		return sub;
	}
	
	//function to create sub-sets
	public static List<String> createsubsets(String s){
		
		List<String> res = new ArrayList<>();
		for(int i = 0 ; i < (1<<s.length()) ; i++){
			//each time we create a subsequence for corresponding binary representation
			res.add(print(s,i));
		}
		return res;
	}
	
	//main function to call
	public boolean isPalindrome(String s) {
		if (s.length() < 1 || s == null) return true;
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (Character.isDigit(s.charAt(start))) start++;
			else if (Character.isDigit(s.charAt(end))) end--;
			else if (Character.isAlphabetic(s.charAt(start)) &&
					Character.isAlphabetic(s.charAt(end)) &&
					Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				return false;
			else {
				start++;
				end--;
			}

		}return true;
	}
	public static void main(String args[])
	{
//		String s = "abc";
//
//		// vector of strings to store all sub-sequences
//		List<String> print = createsubsets(s);
//
//		// print the subsets
//		for (int i = 0; i < print.size(); i++) {
//			for (int j = 0; j < print.get(i).length(); j++) {
//				System.out.print(print.get(i).charAt(j) + " ");
//			}
//			System.out.println();
//		}
	}
}
// This code contributed by Srj_27
