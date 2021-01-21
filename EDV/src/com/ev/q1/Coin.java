package com.ev.q1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Coin {

	public static void main(String[] args) {
		
		String[] borrower = {"Alex", "Brake", "Casey", "Alex"};
		String[] lendor = {"Brake","Alex", "Brake", "Casey"};
		int[] amount = {2,5,7,5};
		String[] friends = {"Alex", "Brake", "Casey"};
		HashMap<String, Integer> resultHashmap= loanTransactions(borrower,lendor,amount, friends);
	
	List<String> list=getResult(resultHashmap);
			System.out.println(list);
		
	}
	
	private static HashMap<String, Integer> loanTransactions(String[] borrower, String[] lendor, int[] amount,
			String[] friends) {
		HashMap< String, Integer> hm = new HashMap<String,Integer>();
		hm.put("a", -2);
		hm.put("b", 4);
		hm.put("c",-2);
		return hm;
	}


	

	private static List<String> getResult(HashMap<String, Integer> resultHashmap) {
		
		  int resv=0;
		  String resk=null;
		  for(Map.Entry<String, Integer> e:resultHashmap.entrySet()) {
			if(e.getValue()<resv) {
				resv=e.getValue();
				resk=e.getKey();
				
			}
		}
		  LinkedList<String> list=new LinkedList<String>();
			if(resv==0) {
				list .add("No person has Negative balance");// IF NO NEGATIVE BALANCE
				
				return list;
		}else {
					
					
				resultHashmap.remove(resk);
		        list.add(resk);
				int count=0;
				  //check if still any values equal to highest negative value i.e  resv is there and add to list 	
			    for(Map.Entry<String, Integer> e1:resultHashmap.entrySet()) {
				   if(e1.getValue()==resv) { 
					count++;
			        list.add(e1.getKey());//(IF MORE THAN ONE HIGHEST NEGATIVE BALANCE)finally list will have all the name of frnds with highest negative balances
			      }
				 
				}
			   //if any MORE THAN ONE HIGHEST NEGATIVE BALANCE are present
			   if(count>0) {
				   
				   String[] strArr=list.toArray(new String[list.size()]);
				  String[] resArray= sortLexicographically(strArr);
				  
				  return(Arrays.asList(resArray)); //Lexicographically sorted names with highest -ve  balances
			   
			   }else //if only ONE HIGHEST NEGATIVE BALANCE is present
			   return list;//result string name
				   
			   
			   
	}
			
			

	}

	// this method sort the string array lexicographically. 
    public static String[]
    sortLexicographically(String strArr[]) 
    { 
        for (int i = 0; i < strArr.length; i++) { 
            for (int j = i + 1; j < strArr.length; j++) { 
                if (strArr[i].compareToIgnoreCase(strArr[j]) 
                    > 0) { 
                    String temp = strArr[i]; 
                    strArr[i] = strArr[j]; 
                    strArr[j] = temp; 
                } 
            } 
        } 
       return strArr; 
    } 
  
	
	
}
