import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Program6 {
	
	public static void main(String[] args) {
		
		//HashMap<String, Integer> obj = new HashMap<String, Integer>();
		//LinkedHashMap<String, Integer> obj = new LinkedHashMap<String, Integer>();
		TreeMap<String, Integer> obj = new TreeMap<String, Integer>();


		
		obj.put("sai", 12345);
		obj.put("renu", 23456);
		obj.put("sri", 8476465);
		obj.put("jyo", 39746);
		obj.put("dash", 7375475);
		
		System.out.println(obj);
	}

}
