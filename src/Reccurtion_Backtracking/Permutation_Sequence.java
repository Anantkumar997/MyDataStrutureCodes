package Reccurtion_Backtracking;

import java.util.ArrayList;

public class Permutation_Sequence {

	static int count = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		int k = 2;
		
		//int[] arr = {1,2,3};
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		boolean[] avl = new boolean[arr.length];
		for (int i = 0; i < avl.length; i++) {
			avl[i] = true;
		}
		
		//ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//permut(k,arr, avl,new ArrayList<>());
		//System.out.println(count);
		
		int[] fact = new int[n];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = fact[i-1] * i;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			list.add(i);
		}
		permut(n, k, fact, list, "");
	}

	// Case 1
	public static void permut(int k,int[] arr,boolean[] avl,ArrayList<Integer> temp) {
		if (temp.size() == arr.length) {
			//list.add(new ArrayList<>(temp));
			if(count == k) {
				System.out.println(temp);
			}
			count++;
			return;
		}
		
		for (int i = 0; i < avl.length; i++) {
			if (avl[i] == false /*||  i>0 &&arr[i] == arr[i-1] && avl[i-1]*/) {
				continue;
			}
			
			avl[i] = false;
			temp.add(arr[i]);
			permut(k,arr, avl, temp);
			temp.remove(temp.size()-1);
			avl[i] = true;
			
		}
	}
	// Case 2
	public static void permut(int n,int k,int[] fact,ArrayList<Integer> list ,String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		int group = k / fact[n-1];
		if(k % fact[n-1] != 0)
			group++;
		
		int newk = k - (group-1) * fact[n-1];
		
		int val = list.remove(group);
		permut(n - 1, newk, fact, list,ans+val);
	}
}
