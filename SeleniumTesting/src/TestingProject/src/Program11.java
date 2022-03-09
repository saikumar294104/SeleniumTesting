
public class Program11 extends Program10 {
	
	public void display() {
		System.out.println("Automation QA");
	}
	
	public static void main(String[] args) {
		
		Program11 ss = new Program11();
		ss.add(10, 20);
		ss.mul(60, 60);
		ss.sub(40, 20);
		ss.div(100, 50);
		ss.display();
		System.out.println("all results");
	}


}
