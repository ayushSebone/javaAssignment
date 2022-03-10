import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		primes(number);	
	}
	public static void primes(int num) {
		int temp = 0;
		for(int i=1; i<num ; i++) {
			for(int j = 2 ; j<= i-1;j++) {
				if(i%j==0) {
					temp = temp+1;
				}
				
			}
			if(temp ==0) {
				System.out.println(i);
			}else {
				temp=0;
			}
		}
	}

}
