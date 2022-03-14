package JavaBasic;
import java.util.*;

public class anagramOfString {
	
	public static boolean isAnagram(String string1, String string2) {
		boolean flag = false;	
		if(string1.length() != string2.length()) {
			flag = false;
			}
		else {
			char [] array1 = string1.toCharArray();
			char [] array2 = string2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			flag = Arrays.equals(array1, array2);		
		}	
		return flag;	
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");	
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String");	
		String str2 = sc.nextLine();
		
		if(isAnagram(str1, str2)){
			System.out.println(str1 +" is an anagram of "+str2);
		}else {
			System.out.println(str1 +" is not an anagram of "+str2);
		}
	}
}
