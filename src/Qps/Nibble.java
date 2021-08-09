package Qps;

public class Nibble {

	public static void main(String[] args) {
		int n = 100 ;
		int n1 = n & 15;
		int n2 = n & 240 ;
		System.out.println(n1<<4 | n2>>4);
	}

}
