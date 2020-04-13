package regex;

public class Intra {

	public static void main(String[] args) {
		
		String str1 = "+1-678-675-(8765)";
		
		String str2 = str1.replace("+", "").replace("-", "").replace("(", "").replace(")", "");
		
		//System.out.println(str2);
		
		String part= "[^A-Za-z0-0]";
		
		String str3 = str1.replaceAll(part, "");
		
		System.out.println(str3);
		

	}

}
