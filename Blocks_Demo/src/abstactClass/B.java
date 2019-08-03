package abstactClass;

public class B extends A {

	@Override
	public void m2() {
	
		System.out.println("m2 ...... overrided.....");
		
	}
	public static void main(String[] args) {
		
		A a=new B();
		a.m1();
	}

}
