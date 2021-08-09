package L1_Basics;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println("hello world " + n);
		int i = 2;
		int count = 0;
		while(i<=Math.sqrt(n)) {
			if(n%i == 0) {
				count++;
				break;
			}
			i++;
		}
		if(count == 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
