import static org.apache.commons.io.FilenameUtils.concat;


public class Program14 {
	
	int result = 0;
	
	public String add13(String a, String b) {
		return concat(a,b);
	}
	
	public int add1(int d) {
		return d;
	}
	
	public float add11(float s) {
		return s;
	}
	
	public double add12(double z) {
		return z;
	}

	
	public static void main(String[] args) {
		Program14 ss = new Program14();
		System.out.println(ss.add13("selenium", "testing"));
		System.out.println(ss.add1(20));
		System.out.println(ss.add11(0.123f));
		System.out.println(ss.add12(1.234));
	}
	

}
