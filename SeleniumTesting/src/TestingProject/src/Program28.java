import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program28 {
	
	@Test(dataProvider="testdata")
	public void testcase(String val1, String val2) {
		System.out.println(val1);
		System.out.println(val2);
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] data(){
		Object[][] testdata = new Object[2][2];
		
		testdata[0][0] = "test1";
		testdata[0][1] = "test1";
		testdata[1][0] = "test1";
		testdata[1][1] = "test1";
		return testdata;

	}

}
