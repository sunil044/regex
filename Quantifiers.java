package regex;

public class Quantifiers {

	public static void main(String[] args) {
		
		String patt1 = "abc*";
		String patt2 = "abc+";
		String patt3 = "abc?";
		String patt4 = "abc(xyz)?";
		String patt5 = "abc(xyz){3}";
		String patt6 = "abc(xyz){2, 6}";
		String patt7 = "abc(xyz){2, }";
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = "abcc";
		String str4 = "abcxyz";
		String str5 = "abcxyzxyzxyz";
		String str6 = "abcxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyzxyz";
		
		System.out.println(str1.matches(patt1));
		System.out.println(str2.matches(patt2));
		System.out.println(str3.matches(patt3));
		System.out.println(str4.matches(patt4));
		System.out.println(str5.matches(patt5));
		System.out.println(str5.matches(patt6));
		System.out.println(str6.matches(patt7));

	}

}
