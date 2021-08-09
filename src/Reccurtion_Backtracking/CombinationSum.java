package Reccurtion_Backtracking;

import java.util.ArrayList;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] demon = {2,3,5};
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//userRespect(demon, 0, 8, new ArrayList<Integer>(), list);
		coinRespect(demon, 0, 8, new ArrayList<Integer>(), list);
		System.out.println(list);

	}
	public static void userRespect(int[] demon, int vidx, int amt, java.util.List<Integer> temp,ArrayList<ArrayList<Integer>> list) {
		
		if(amt == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if(amt<0) {
			return;
		}
		
			
		for (int i = vidx; i < demon.length; i++) {
			temp.add(demon[i]);
			userRespect(demon, i, amt-demon[i], temp, list);
			temp.remove(temp.size()-1);
			
		}
		
	}

	public static void coinRespect(int[] demon, int vidx, int amt, java.util.List<Integer> temp,ArrayList<ArrayList<Integer>> list) {
		
		if (amt == 0) {
			
			list.add(new ArrayList<>(temp));
			return;
		}
		if (vidx == demon.length || amt < 0) {
			return;
			
		}
		
		temp.add(demon[vidx]);
		coinRespect(demon, vidx, amt-demon[vidx], temp, list);
		temp.remove(temp.size()-1);
		coinRespect(demon, vidx+1, amt, temp, list);
		
	}
}
