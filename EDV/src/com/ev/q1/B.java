package com.ev.q1;

public class B extends A {
	private int a=2;
	@Override
	public void print() {
		
		System.out.println(a);
		
	}
	
	
	public void printw() {
		
		System.out.print("i am child");
	}
	public static void main(String[] args) {
		
    B a=new B();
    
    a.print();
    a.printw();
	}

}

