package Reccurtion_Backtracking;

import java.util.ArrayList;

public class Combination3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int n = 45;
		int k = 9;
		userRespect(1, n, k, new ArrayList<>(), list);
		System.out.println(list);

	}

	public static void userRespect(int start, int n, int k, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list) {
		
		if(k == 0) {
		
			if(n == 0)
				list.add(new ArrayList<>(temp));
			return;
		}
		if(start > 9 || n<0) {
			return;
		}
		
			
		for (int i = start; i <= 9; i++) {
			
			temp.add(i);
			userRespect(i+1,n-i, k-1, temp, list);
			temp.remove(temp.size()-1);
			
		}
	}

}
