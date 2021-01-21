package com.ev.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array {

	
	public static void main(String[] args) {
		int a[]= {1,2,2};
		int subsLength=2;
		int result= solution(a,subsLength);
		System.out.println(result);
	}
	
	
	private static int solution(int[] a, int subsLength) {
		
    List<Integer> listInput = new ArrayList<>(); 
    for (int i : a)
    	listInput.add(i); 
    
    //creating a "Set" of all possible substrings from input string
    List<Integer> subs=null;
	List<List<Integer>> subStrings=new ArrayList<>();
	
	for(int i=0; i<=listInput.size();i++) {
	for(int j=i+1; j<=listInput.size();j++) {
		 subs= new ArrayList<Integer>();
		 subs= listInput.subList(i,j);
		 if(subs.size()==subsLength)
		 subStrings.add(subs);
		 }
	}

	Iterator<List<Integer>> iterator=subStrings.iterator();
	 List<Integer>  resList=new ArrayList<Integer>();
	  while(iterator.hasNext()) {
      	resList.add(Collections.min(iterator.next()) );   
	  }
	 
	return (Collections.max(resList));
	
}
	
	
}
