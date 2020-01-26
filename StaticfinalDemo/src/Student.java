import java.util.HashMap;
import java.util.Map;

public class Student {
	
	int id;
	static int counter;
	
static Map<String,String> map = new HashMap<String,String>();

public Student() {
	System.out.println("inside no arg constructor");
}


public static void test() {
	System.out.println("inside static method");

}


static {
	System.out.println("inside static block");
	map.put("abc", "1234");
	map.put("xyz", "4567");
	map.put("aaa", "1111");
	
	test();
}

public void testme(){
	counter++;
}
//instance initializer
{
	System.out.println("inside init block");
}

{
	System.out.println("inside init block1");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student();

	}

}
