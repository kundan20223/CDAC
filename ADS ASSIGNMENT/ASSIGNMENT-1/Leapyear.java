
import java.util.Scanner;

public class Leapyear {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter leap year: ");
		int n=sc.nextInt();
		
		boolean leap= false;
		if(n%4==0) {
			
			if(n%100==0) {
				
				if(n%400==0) 
					leap= true;
				else
					leap=false;
				}
				leap = true;
			}
				else 
					leap= false;
				
			System.out.println(n + " is a leap year " + leap);
		}
		
		
		
		
		

	}


