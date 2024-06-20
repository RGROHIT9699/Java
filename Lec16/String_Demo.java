package Lec16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String ("Hello");
		String str4 = new String("Hello");
		System.out.println(str1==str3); 
		System.out.println(str1==str2); 
		System.out.println(str4==str3); 
		System.out.println(str1);
		str1= str1+"Bye";
		str3= str1+"ok";
		System.out.println(str1);
		System.out.println(str3);
		String str5 ="Kaju" +"Kamlesh";
		System.out.println(str5);
	}

}

//public class Main {
//    public static void main(String[] args) {
//        String S = "aabccba";
//        System.out.println(removeConsecutiveDuplicates(S));
//    }
//
//    public static String removeConsecutiveDuplicates(String S) {
//        StringBuilder result = new StringBuilder();
//        char lastChar = '\0';
//        for (char c : S.toCharArray()) {
//            if (c != lastChar) {
//                result.append(c);
//                lastChar = c;
//            }
//        }
//        return result.toString();
//    }
//}
