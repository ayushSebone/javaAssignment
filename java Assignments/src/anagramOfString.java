
import java.util.*;

public class anagramOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");	
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String");	
		String str2 = sc.nextLine();
		boolean flag = false;
		
		if(str1.length() != str2.length()) {
			flag = false;
			
		}else {
			char [] arr1 = str1.toCharArray();
			char [] arr2 = str1.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			flag = Arrays.equals(arr1, arr2);
					
			
		}
		
		if(flag) {
			System.out.println("Both Strings are anagram of each other");		
		}else {
			System.out.println("Both Strings arn't anagram of each other");	
		}

	}

}
