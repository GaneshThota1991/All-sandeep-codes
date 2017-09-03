package pac1;

public class B {

	static int c=30;
	A a1=new A();
	public void add() {
	//	System.out.println(a+b+c);c.t.e
		//System.out.println(new A().a+new A().b+c);
		
		System.out.println(a1.a+a1.b+c);
		
	}
	
	public void sub() {
		System.out.println(a1.a-c);
	}
	
	public static void mul() {
		
		A aa=new A();
		System.out.println(aa.a*c);
		System.out.println(aa.a*aa.b*c);
	}

}
