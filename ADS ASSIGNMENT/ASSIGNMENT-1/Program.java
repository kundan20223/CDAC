
import java.util.Scanner;


public class Program {
	
	
	
	public static void main(String[] args) {
		
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("Enter : ");
	    
	    int ins= sc.nextInt();
	    
	    if(ins%2!=0) {
	    	System.out.println("given number is prime");
	    } 
	    
	    else {
	    	System.out.println("given number is not prime");
	    }
		
	}
	

}
