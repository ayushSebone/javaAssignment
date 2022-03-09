
import java.util.*;

public class anagramOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");	
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String");	
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both the string are not anagram to each other");
		}else {
			char [] arr1 = str1.toLowerCase().toCharArray();
			char [] arr2 = str1.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("Both Strings are anagram of each other");		
			}else {
				System.out.println("Both Strings arn't anagram of each other");	
			}
			
		}

	}

}
