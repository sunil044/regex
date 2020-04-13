package regex;

public class Dot_Operator {

	public static void main(String[] args) {
		
		String patt1 = "ABC.";
		String patt2 = "ABC.*";
		
		String str1 = "ABC9";
		String str2 = "ABC9svfdvdsvcd";
		
		System.out.println(str1.matches(patt1));
		System.out.println(str2.matches(patt2));

	}

}
