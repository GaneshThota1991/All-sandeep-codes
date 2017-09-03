package com.sandeep.java;

public class FreeSpace {

	public  void main(String[] args) {
		FreeSpace Sandeep =new FreeSpace();
		Sandeep.A();
		Sandeep.B();
		Sandeep.C();
		Sandeep.D();
	E();
	
	
	
		
		FreeSpace Sandeep1 =new FreeSpace();
		Sandeep1.E();
		Sandeep1.addF(10, 90);
		Sandeep1.multiplicationH(500, 500);
		
		
		
/**
 * @author Administrator
 * @
 */
	}


	public void A() {
		System.out.println("A");

	}

	public FreeSpace B() {
		System.out.println("B");
		return this;

	}

	public String C() {
		System.out.println("c");
		return null;

	}

	public int D() {
		System.out.println("D");
		return 0;

	}

	public static void E() {
		System.out.println("E");

	}

	public  int addF(int a, int b) {
		System.out.println(a + b);
		return 0;

	}

	public String G(String in) {
		System.out.println("E");
		return null;
		
	}
	

	public void multiplicationH(int b, int c) {

		System.out.println(b * c);
	}

}