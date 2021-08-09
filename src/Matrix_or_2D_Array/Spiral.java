package Matrix_or_2D_Array;

import java.util.ArrayList;

public class Spiral {

	public static void main(String[] args) {
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = {{22},{3},{21},{2}} ;
		ArrayList<Integer> list = spirallyTraverse(arr, arr.length, arr[0].length) ;
		System.out.println(list);

	}
	
	static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
		int minCol = 0 ;
		int maxCol = c - 1 ;
		int minRow = 0 ;
		int MaxRow = r - 1 ;
		ArrayList<Integer> list = new ArrayList<>() ;
		int count = 0 ;
		int net = r * c ;
        for( ; count < net ;) {
        	for (int c1 = minCol; c1 <= maxCol && count < net; c1++) {
				list.add(arr[minRow][c1]);
				count++;
			}
        	minRow++;
        	for (int r1 = minRow; r1 <= MaxRow && count < net; r1++) {
				list.add(arr[r1][maxCol]) ;
				count++;
			}
        	maxCol--;
        	for (int c2 = maxCol; c2 >= minCol && count < net; c2--) {
				list.add(arr[MaxRow][c2]) ;
				count++ ;
			}
        	MaxRow--;
        	for (int r2 = MaxRow; r2 >= minRow && count < net; r2--) {
				list.add(arr[r2][minCol]) ;
				count++ ;
			}
        	minCol++;
        }
        return list ;
    }
}
