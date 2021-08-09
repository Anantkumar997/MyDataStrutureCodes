package Strings;

import java.util.Scanner;

public class StringsOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.next();
		System.out.println(countPalindromicSubstring(str));

	}
	public static int countPalindromicSubstring(String str) {
		// odd length palindromic substrings
		int count = 0;
		for(int axis = 0 ;axis < str.length();axis++ ) {
			for(int orbit = 0 ; axis - orbit >= 0 && axis + orbit < str.length() ; orbit++) {
				if(str.charAt(axis - orbit) == str.charAt(axis + orbit))
					count++;
				else
					break;
			}
		}
		// even length palindromic substrings
		for(double axis = 0.5 ;axis < str.length();axis++ ) {
			for(double orbit = 0.5 ; axis - orbit >= 0 && axis + orbit < str.length() ; orbit++) {
				if(str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit)))
					count++;
				else
					break;
			}
		}
		return count;
	}

}
