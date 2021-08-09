package Matrix_or_2D_Array;

public class Search_in_Matrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,10},{7,8,9}};
		System.out.println(searchMatrix(arr,6 ));
	}

public static boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length ;
        int m = arr[0].length ;
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j] == target)
					return true ;
			}
		}
        return false ;
    }
}
