package JavaBasic;
import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		isPallindrome(number);		
	}
	public static void isPallindrome(int num) {
		int temp = num;
		int rev = 0;
		int sum =0;
		while(num>0) {  
				rev =num%10;    
				sum=sum*10+rev;    
				num=num/10;    
			  
		}
		if(temp == sum) {
			System.out.println("pallindrome");
			return;
		}else {
			System.out.println("not pallindrome");
			return;
		}
	}

}
