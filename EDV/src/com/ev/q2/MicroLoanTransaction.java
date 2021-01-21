package com.ev.q2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class MicroLoanTransaction {

public static void main(String[] args) {
		
		String[] lines = {"Alex Brake 2", "Brake Alex 5", "Casey Brake 7", "Alex Casey 5"};
		
		HashMap<String, Integer> resultHashmap= loanTransactions(lines);
	
	TreeSet<String> set=getResult(resultHashmap);
			System.out.println(set);
		
	}
	
	private static HashMap<String, Integer> loanTransactions(String[] lines) {
		LinkedList< String> brList= new LinkedList<String>();
		LinkedList< String> leList= new LinkedList<String>();
		LinkedList< String> amList= new LinkedList<String>();
		
		for(String s1:lines) {
			
			String[] arr=s1.split(" ");
			
			brList.add(arr[0]);
			leList.add(arr[1]);
			amList.add(arr[2]);
			
		}
		
		
		
		
		
		
		
		//getting all unique friends possible in a set
		HashSet<String> friends  = new HashSet<String>();
		
		for(String s:brList) 
			friends.add(s);	
		
		for(String s:leList) 
			friends.add(s);	
		//for result balance of each friend
		HashMap< String, Integer> hm = new HashMap<String,Integer>();
		for(String s:friends) 
			hm.put(s, 0);	
		
		for(int i=0;i<lines.length;i++) {
			
			String borrower=brList.get(i);
			String lendor=leList.get(i);
			int amount=Integer.parseInt(amList.get(i));
			//Actual logic
			for(Map.Entry<String, Integer> e:hm.entrySet()) {
				
				if(borrower.equals(e.getKey())) 
					hm.put(borrower , e.getValue()-amount);
				
				if(lendor.equals(e.getKey())) 
					hm.put(lendor , e.getValue()+amount);
					
				}
			
			
		}
		
		
//		hm.put("a", -8);
//		hm.put("b", 4);
//		hm.put("c",-2);
		return hm;
	}


	

	private static TreeSet<String> getResult(HashMap<String, Integer> resultHashmap) {
		
		  int resv=0;
		  String resk=null;
		  for(Map.Entry<String, Integer> e:resultHashmap.entrySet()) {
			if(e.getValue()<resv) {
				resv=e.getValue();
				resk=e.getKey();
				
			}
		}
		  TreeSet<String> set=new TreeSet<String>();
			if(resv==0) {
				set.add("No person has Negative balance");// IF NO NEGATIVE BALANCE
				
				return set;
		}else {
			    resultHashmap.remove(resk);
		        set.add(resk);
				
				  //check if still any values equal to highest negative value i.e  resv is there and add to list 	
			    for(Map.Entry<String, Integer> e1:resultHashmap.entrySet()) {
				   if(e1.getValue()==resv) 
				set.add(e1.getKey());//(IF MORE THAN ONE HIGHEST NEGATIVE BALANCE)finally list will have all the name of frnds with highest negative balances
			    
				 }
			    
			    
			    return set;
	        }
			
}
}
