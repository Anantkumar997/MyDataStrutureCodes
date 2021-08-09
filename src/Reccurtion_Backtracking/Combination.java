package Reccurtion_Backtracking;

import java.util.ArrayList;

public class Combination {

	//static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //userRespect(n,k,new ArrayList<>(),list,1);
		coinRespect(n, k, new ArrayList<>(), list, 1);
        System.out.println(list);

	}

	public static void userRespect(int n, int k, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list,int count) {

		if(k == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(k<0){
            return;
        }
        for(int i = count;i<=n;i++){
            temp.add(i);
            userRespect(n,k-1,temp,list,i+1);
            temp.remove(temp.size()-1);
        }
	}

	public static void coinRespect(int n, int k, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> list,int Start) {
		
		if(k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		if(Start > n) {
			return;
		}
		//for(int i = count;i<=n;i++) {
			
			
			temp.add(Start);
			coinRespect(n, k-1, temp, list, Start+1);
			temp.remove(temp.size()-1);
			coinRespect(n, k, temp, list, Start+1);
		//}
		
	}

}
