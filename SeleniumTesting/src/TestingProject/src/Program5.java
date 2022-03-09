import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Program5 {
	
	public static void main(String[] args) {
		
		//<String> obj = new ArrayList<String>();
		//LinkedList<String> obj = new LinkedList<String>();
		//HashSet<String> obj = new HashSet<String>();
		//LinkedHashSet<String> obj = new LinkedHashSet<String>();
		TreeSet<String> obj = new TreeSet<String>();

		
		obj.add("123");
		obj.add("456");
		obj.add("789");
		obj.add("135");
		obj.add("246");

		System.out.println(obj);
		obj.add("string");
		System.out.println(obj);
	}

}
