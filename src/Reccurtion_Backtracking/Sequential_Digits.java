package Reccurtion_Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class Sequential_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sequentialDigits(234, 2314);
	}
	public static void sequentialDigits(int low, int high) {
		ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=9; i++) {
			sequentialDigits(i, low, high,list);
		}
        Collections.sort(list);
        System.out.println(list);
    }
	public static void sequentialDigits(int curr, int low, int high) {
        
		if(curr > low && curr < high) {
			System.out.println(curr);
		}
		if (curr > high) {
			return;
		}
		int ld = curr % 10;
		
		if (ld != 9) {
			sequentialDigits(curr*10 + (ld+1), low, high);
		}
    }

	public static void sequentialDigits(int curr, int low, int high,ArrayList<Integer> list) {
        
		if(curr >= low && curr <= high) {
			//System.out.println(curr);
			list.add(curr);
		}
		if (curr > high) {
			return;
		}
		int ld = curr % 10;
		
		if (ld != 9) {
			sequentialDigits(curr*10 + (ld+1), low, high,list);
		}
    }
}
