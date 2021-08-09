package Qps;

public class ZigZag {

	public static void main(String[] args) {
		int[] arr = {9,7,6,5,4,3,2,8} ;
		boolean flag = true ;
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			if(flag) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i] ;
					arr[i] = arr[i + 1];
					arr[i+1] = temp ;
				}
			}else {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i] ;
					arr[i] = arr[i + 1];
					arr[i+1] = temp ;
				}
			}
			flag = !flag ;
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}

	}

}
