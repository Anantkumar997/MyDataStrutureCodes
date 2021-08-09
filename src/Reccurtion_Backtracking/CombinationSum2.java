package Reccurtion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] demon = {10,1,2,7,6,1,5};
		Arrays.sort(demon);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//userRespect(demon, 0, 8, new ArrayList<Integer>(), list);
		coinRespect(demon, 0, 8, new ArrayList<Integer>(), list,true);
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
			
			if(i > vidx && demon[i] == demon[i-1])
				continue;
			
			temp.add(demon[i]);
			userRespect(demon, i+1, amt-demon[i], temp, list);
			temp.remove(temp.size()-1);
			
		}
		
	}

	public static void coinRespect(int[] demon, int vidx, int amt, java.util.List<Integer> temp,ArrayList<ArrayList<Integer>> list, boolean flag) {
		
		if (amt == 0) {
			
			list.add(new ArrayList<>(temp));
			return;
		}
		if (vidx == demon.length || amt < 0) {
			return;
			
		}
		
		if (flag == false && demon[vidx] == demon[vidx-1] ) {
			coinRespect(demon, vidx+1, amt, temp, list, false);
		}else {
			temp.add(demon[vidx]);
			coinRespect(demon, vidx+1, amt-demon[vidx], temp, list,true);
			temp.remove(temp.size()-1);
			coinRespect(demon, vidx+1, amt, temp, list,false);
		}
		
	}
}
