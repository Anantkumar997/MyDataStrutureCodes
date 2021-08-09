package Loops;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(palindrom(202));
	}
	public static boolean palindrom(int n){
	    int ans = 0 ;
	    int n1 = n ;
	    while(n1 > 0){
	        int rem = n1 % 10 ;
	        ans = ans*10 + rem ;
	        n1 = n1 / 10 ;
	    }
	    if(ans == n)
	        return true ;
	        
	    return false ;
	}
}
