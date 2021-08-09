package Reccurtion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class subsetCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,4,4,1,4};
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		//elementRespect(arr, 0, "", true);
		Arrays.sort(arr);
//		elementRespect(arr, 0, new ArrayList<>(), list, true);
//		System.out.println(list);
		//userRespect(arr, 0, "");
		userRespect(arr, 0, new ArrayList<>(), list);

		System.out.println(list);
	}

	public static void userRespect(int[] arr,int vidx,String ans) {

		System.out.println(ans);
		for(int i = vidx;i<arr.length;i++) {
			if(i > vidx && arr[i] == arr[i-1])
				continue;
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
			
			if(i > vidx && arr[i] == arr[i-1])
				continue;
			
			temp.add(arr[i]);
			userRespect(arr, i+1, temp,list);
			temp.remove(temp.size()-1);
		}
	}
	
	public static void elementRespect(int[] arr, int vidx, String ans,boolean flag) {
		
		if(vidx == arr.length) {
			System.out.println(ans);
			return;
		}
		
		if(flag == false && arr[vidx] == arr[vidx-1])
			elementRespect(arr, vidx+1,ans,false );
		else {
			elementRespect(arr, vidx+1,ans + arr[vidx],true );//yes
			elementRespect(arr, vidx+1,ans,false );		//No
		}
	}
	
	public static void elementRespect(int[] arr, int vidx, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list,boolean flag) {
		
		if(vidx == arr.length) {
			//System.out.println(ans);
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(flag == false && arr[vidx] == arr[vidx-1]) {
			elementRespect(arr, vidx+1,temp,list,false );
		}else {
			temp.add(arr[vidx]);
			elementRespect(arr, vidx+1,temp,list,true );//yes
			temp.remove(temp.size()-1);
			elementRespect(arr, vidx+1,temp,list,false );		//No
		}
	}

}
