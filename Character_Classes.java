package regex;

public class Character_Classes {

	public static void main(String[] args) {
		
		String patt1 = "\\d{3}";
		String patt2 = "\\w{4}";
		String patt3 = "\\s";
		String patt4 = "\\D{2,9}";
		String patt5 = "\\W{2,9}";
		String patt6 = "678\\d{7}";
		String patt7 = "\\w{2,6}\\W{2}";
		
		String str1 = "695";
		String str2 = "Aa_8";
		String str3 = " ";
		String str4 = "%^&cvUKH";
		String str5 = "%^&*%$";
		String str6 = "6785489674";
		String str7 = "rty*(";
		
		
		System.out.println(str1.matches(patt1));
		System.out.println(str2.matches(patt2));
		System.out.println(str3.matches(patt3));
		System.out.println(str4.matches(patt4));
		System.out.println(str5.matches(patt5));
		System.out.println(str6.matches(patt6));
		System.out.println(str7.matches(patt7));
	}

}
