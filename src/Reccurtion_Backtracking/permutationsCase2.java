package Reccurtion_Backtracking;

import java.util.ArrayList;

public class permutationsCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void permut(int[] arr,boolean[] avl,ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> list) {
		if (temp.size() == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for (int i = 0; i < avl.length; i++) {
			if (avl[i] == false) {
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
