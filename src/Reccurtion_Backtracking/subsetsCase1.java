package Reccurtion_Backtracking;

import java.util.ArrayList;

public class subsetsCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int[] arr = {1,2,3};
		//elementRespect(arr, 0, new ArrayList<>(),list);
		//System.out.println(list);
		userRespect(arr, 0, new ArrayList<>(),list);
		System.out.println(list);
	}
	
	public static void userRespect(int[] arr,int vidx,String ans) {

		System.out.println(ans);
		for(int i = vidx;i<arr.length;i++) {
			
			userRespect(arr, i+1, ans+arr[i]);
		}
//		if(vidx == arr.length) {
//			//System.out.println(ans);
//			return;
//		}
	}
	public static void userRespect(int[] arr,int vidx,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list) {

		list.add(new ArrayList<>(temp));
		for(int i = vidx;i<arr.length;i++) {
			temp.add(arr[i]);
			userRespect(arr, i+1, temp,list);
			temp.remove(temp.size()-1);
		}
	}
	
	public static void elementRespect(int[] arr, int vidx, String ans) {
		
		if(vidx == arr.length) {
			System.out.println(ans);
			return;
		}
		
		elementRespect(arr, vidx+1,ans + arr[vidx] );//yes
		elementRespect(arr, vidx+1,ans );		//No
	}
	
	public static void elementRespect(int[] arr, int vidx, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list) {
		
		if(vidx == arr.length) {
			//System.out.println(ans);
			list.add(new ArrayList<>(temp));
			return;
		}
		
		temp.add(arr[vidx]);
		elementRespect(arr, vidx+1,temp,list );//yes
		temp.remove(temp.size()-1);
		elementRespect(arr, vidx+1,temp,list );		//No
	}

}
