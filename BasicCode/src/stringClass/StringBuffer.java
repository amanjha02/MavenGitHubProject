package stringClass;

public class StringBuffer {
	 static String reverseNumber="";
	public static  void toggleString() {
		String str="Aman Kumar jha";
		String [] word=str.split("\\s");
		for(String w: word) {
			StringBuilder builder=new StringBuilder(w);
			//builder.reverse();
			String afterFirst=builder.substring(1);
			String first=builder.substring(0, 1);
			reverseNumber =reverseNumber+first.toLowerCase()+ afterFirst.toUpperCase()+" ";
			
		}
		System.out.println(reverseNumber.trim());
	}
	
public static void main(String[] args) {
	toggleString();
	
	/*String reverse="";
String str ="Aman Kumar Jha";
StringBuilder str1=new StringBuilder(str);
//System.out.println(str1.reverse());
String [] w=str.split("\\s");
System.out.println(w.length);

for(String word:w) {
	System.out.println(word);
	
	StringBuilder str2=new StringBuilder(word);
 reverse=reverse+str2.reverse() +" ";
	
	
}
System.out.println(reverse);
}*/
}
}
