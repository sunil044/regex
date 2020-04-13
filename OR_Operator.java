package regex;

public class OR_Operator {

	public static void main(String[] args) {
		
		String patt = "a(b|c)";
		
		String str1 = "ac";
		
		System.out.println(str1.matches(patt));

	}

}
