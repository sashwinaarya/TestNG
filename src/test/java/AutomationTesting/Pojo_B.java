package AutomationTesting;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A p=new Pojo_A();
		
		int a2 = p.getA();
		
		p.setA(100);
		
		int a = p.getA();
		
		System.out.println("Set Value: " +a +" Get Value " +a2);
		
	
	}

}
