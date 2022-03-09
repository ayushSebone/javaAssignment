import java.util.*;
public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter the article");
		String scr1 = sc.nextLine();
		System.out.println("Enter the word");
		String scr2 = sc.nextLine();
		
		String temp = "";
		
		for(int i=0; i<scr1.length(); i++) {
			 
			if(scr1.charAt(i) != ' ') {
				temp = temp + scr1.charAt(i);
				
			}else {
				if (scr2.equals(temp))
				{
					count ++;
				}
				temp = "";
			}
		}
		if(scr2.equals(temp)) {
			count ++;
		}
		System.out.println(count);
	}

}
