
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "hello";
		String s1 =  new String("hello");
		String s2 = "hello";
		String s3 = s2;
		String a = "hel"+"lo";
		String b1="lo";
		String b = "hel"+b1;
		//System.out.println("s :"+s.hashCode()+" s1:"+s1.hashCode());
		//b = b.intern();
		System.out.println("s==s1 "+(s==s1));
		System.out.println("s==s2 "+(s==s2));
		System.out.println("s==s3 "+(s==s2));
		System.out.println("s==a "+(s==a));
		System.out.println("s==b "+(s==b.intern()));
		String st = "hello";
		System.out.println("substring :"+st.substring(1));
		System.out.println("st :"+st);
		StringBuilder sb =  new StringBuilder("hello");
		sb.append(" ").append("wolrd");
		System.out.println("appended string :"+sb.delete(0, 4));
		System.out.println("sb :"+sb);
		System.out.println("\'"+"hello"+"\'");
		
		StringBuffer sbuffer = new StringBuffer();
		
	}

}
