import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJdk8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String S ="Murder    for a jar of red rum";
	StringBuffer tmp =  new StringBuffer(S.replaceAll(" ", ""));
	//System.out.println("before tmp :"+tmp);	
	tmp.reverse();
//	System.out.println("after tmp :"+tmp);
	if(tmp.toString().equalsIgnoreCase(S.replaceAll(" ", ""))) {
		System.out.println("true");	 
	}else {
		System.out.println("false");	 
	}

}
}
