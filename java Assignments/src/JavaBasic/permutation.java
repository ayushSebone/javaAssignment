package JavaBasic;
import java.util.*;
public class permutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		printPermutations(str ,"");
		
	}
	public static void printPermutations(String strq , String ans) {
		if(strq.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i =0; i<strq.length();i++) {
			char ch = strq.charAt(i);
			String lpart = strq.substring(0, i);
			String rpart = strq.substring(i+1);
			String restOfQ = lpart + rpart;
			printPermutations(restOfQ , ans + ch );
		}
		
		
	}

}
