
package StringBuilder;


public class StringBuilderDemo {

 static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "Happy";
		StringBuilder strB1 = new StringBuilder("Happy"); 
		StringBuilder strB2 = new StringBuilder("AAA"); 
		System.out.println(strB1);
		
		strB1.append(" Birthday");
		System.out.println(strB1);
		
		strB1.insert(0, false);
		
		
		
		
		char ch = '$';
		Character ch1 = '&';
		
		String str6 = "tydf";
		String str7 = "abctydf";
		if(str6.regionMatches(0, str7, 3, 4))
			System.out.println("yes");
		else
			System.out.println("no");
		
		int iVal = 45;
		String sVal = Integer.toString(iVal);
		String s = "45";
		int val = Integer.parseInt(s);
		
		String str4 = "Beautiful British Columbia";

		String[] strArr = str4.split(" ");
		
		for(int i = 0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println(str4.replace(' ', '_'));
		System.out.println(str4.indexOf('b'));
		
		int count = 1;
		for(int i = 0;i<str4.length();i++) {
			if(str4.charAt(i) == ' ') {
				count++;
				
			}
		}
		System.out.println("number of words " + count);
		
		
		String str3 = "canada";
		for(int i = 0;i<str3.length();i++) {
			System.out.println(str3.charAt(i)+" ");
		}
		
		System.out.println(Character.toUpperCase(ch));
		
		String str = "abc";
		String str1 = new String("dfg");
		
		System.out.println(str.compareTo(str1));
		if(str.compareTo(str1) ==0) {
			System.out.println("same");
		}else if(str.compareTo(str1) < 0) {
			System.out.println("first string is smaller");
			
		}else if (str.compareTo(str1) > 0) {
			System.out.println("first string is bigger");
		}
		
		if(str.equals(str1)) {
			System.out.println("same string");
		}
		else {
			System.out.println("different");
			
		}
	}

}
