package Matrix_or_2D_Array;

import java.util.Arrays;

public class Median_of_Matrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(median(arr, arr.length, arr[0].length));

	}
	static int median(int arr[][], int r, int c) {
        // code here 
		int[] temp = new int[r * c] ;
		int count = 0 ;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				temp[count] = arr[i][j] ;
				count++;
			}
		}
		Arrays.sort(temp);
		count--;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = temp[count] ;
				count--;
			}
		}
		return arr[r/2][c/2] ;
    }

}
