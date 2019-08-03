package defaultMethodDemo;

import instance.A;

public class B extends A{

	public static void main(String[] args) {
		
		B b =new B();
		b.m1();
		
		C c=new C();
		System.out.println("calling with c");
		c.m1();
		
		B b1=new C();
		System.out.println("B b1=new C() ======");
		b1.m1();
								
	}
	
	
}

class C extends B
{
	public static void main(String[] args) {

	B b =new B();
		//b.m1();
		
		C c=new C();
		c.m1();
	}
}