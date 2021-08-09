package Reccurtion_Backtracking;

import java.util.ArrayList;

public class permutationsCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2};
		boolean[] avl = new boolean[arr.length];
		for (int i = 0; i < avl.length; i++) {
			avl[i] = true;
		}
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		permut(arr, avl, new ArrayList<>(), list);
		System.out.println(list);
	}

	public static void permut(int[] arr,boolean[] avl,ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		if (temp.size() == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for (int i = 0; i < avl.length; i++) {
			if (avl[i] == false ||  i>0 &&arr[i] == arr[i-1] && avl[i-1]) {
				continue;
			}
			
			avl[i] = false;
			temp.add(arr[i]);
			permut(arr, avl, temp, list);
			temp.remove(temp.size()-1);
			avl[i] = true;
			
		}
	}
}
