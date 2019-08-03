package interfaceDemo;

public class A implements I1 {

	@Override
	public void Shows() {
		
		System.out.println("show done");
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.Shows();
	}

}
