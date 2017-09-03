package com.tmobil.common;

public class Sample1 {

	public void m() {

	}

	public String mm() {

		return null;
	}

	public static int mmmm(int a, int b) {

		return 0;
		
	}

	public Sample1 openBrowser() {
		System.out.println("select browser....");
		return this;

	}

	public Sample1 login() {

		System.out.println("login page");
		return this;
	}

	public Sample1 closeBrowser() {
		System.out.println("close browser");
		return this;
	}

	// method name and class name's are user defined names
	// java doc's-->nothing but is description of method
	/**
	 * @author Sandeep
	 * @date 08-08-2017
	 * @description 
	 * @version 1.0.1
	 * 
	 */
	//x is non static parameter less method
	public void x() {

	}
	
	//addition method is non static parameterized method
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}

	public static void y() {

	}
	
	public void sandeep() {
		System.out.println("Hi sandeep");
	}
	
	public static void rajesh() {
		System.out.println("rajesh is static method..");
	}
	
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	//jvm method
	//this is execution engine
	//this is execution entry point
	//with out main method can't execute
	public static void main(String[] args) {
		System.out.println("Hello sandeep..how are u");
		//for non static method should create object...through object we can call non static method
		//fon static method no need to create object in the same class
		
		//object creation
		//classname objectname=new classname();
		/*Sample1 s=new Sample1();
		s.*/
		//new Sample1().addition(22, 44);
		Sample1 l=new Sample1();
		l.login();
		l.sandeep();
		rajesh();
		l.multiplication(222, 333);
		addition(11, 33);
		
		
	}

}
