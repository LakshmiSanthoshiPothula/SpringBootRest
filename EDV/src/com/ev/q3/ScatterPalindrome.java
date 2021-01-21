package com.ev.q3;

import java.util.HashSet;

public class ScatterPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="abaaa";
      	HashSet<String> hs= scatterPalindromes(s1);
      	System.out.println(hs);
	}

	private static HashSet<String> scatterPalindromes(String s1) {
		 HashSet<String> result = new HashSet<>();
		    for (int i = 0; i < s1.length(); i++) {
		        for (int j = i + 1; j <= s1.length(); j++) {
		            if (truePalindrome(s1.substring(i, j))) {
		                result.add(s1.substring(i, j));
		            }
		        }
		    }
		    return result;
	}

	private static boolean truePalindrome(String substring) {
		 StringBuffer str1 = new StringBuffer(substring);
		    StringBuffer str2 = str1.reverse();
		    return (str2.toString()).equals(substring);
	}

}
