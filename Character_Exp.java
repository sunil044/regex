package regex;

public class Character_Exp {

	public static void main(String[] args) {
		
		String patt = "[^A-Z]at";
		
		String str1 = "aat";
		
		System.out.println(str1.matches(patt));

	}

}
