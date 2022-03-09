import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		int temp = number;
		int rev = 0;
		int sum =0;
		while(number>0) {  
				rev =number%10;    
				sum=sum*10+rev;    
				number=number/10;    
			  
		}
		if(temp == sum) {
			System.out.println("pallindrome");
			
		}else {
			System.out.println("not pallindrome");
		}
	}

}
