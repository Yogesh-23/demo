package instance;

 public class A {

	 protected void m1()
	 {
		 System.out.println("in protected M1 of A class in Instance package");
	 }
	 
	 public static void main(String[] args) {
		
		 A a =new A();
		 System.out.println("In main method A");
		 B b=new B();
		 b.main(args);
	}
}

 class B{
	
	 public static void main(String[] args) {
			
		 A a =new A();
		 System.out.println("In main method B");
	}
}