package com.ev.q2;

import java.util.StringTokenizer;  
public class Add{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("I am     in                    New   york  Ciiiiiity  now ");
   int length=Integer.MAX_VALUE;
   String result=null;
     while (st.hasMoreTokens()) {
    	 String s=st.nextToken();
    	 if(s.length()<length) {
    	  result= s;
          length=result.length();
         
    	 }
    	 
    	 
     }
     
     System.out.println(result);  
   }  
}  