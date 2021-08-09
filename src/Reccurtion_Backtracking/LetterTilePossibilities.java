package Reccurtion_Backtracking;

import java.util.ArrayList;

public class LetterTilePossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTilePossibilities("AAB"));

	}
	
	static int count ;
	
	public static int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        
        for (int i = 0; i < tiles.length(); i++) {
			
        	char ch = tiles.charAt(i);
        	freq[ch-'A']++;
		}
        
        count = 0;
        numTilePossibilities(freq, "");
        
        return count-1;
    }
	
	public static void numTilePossibilities(int[] freq,String ans) {

		//System.out.println(ans);
		
		count++;
		
		for (int i = 0; i < freq.length; i++) {
			
			if(freq[i] > 0) {
				
				freq[i]--;
				numTilePossibilities(freq, ans + (char)(i + 'A'));
				freq[i]++;
			}
		}
		
	}


}
