
public class Program1 {
	
     public static void main (String[] args) {
    	 
    	 int n=154;
    	 int temp=n;
    	 int r, sum=0;
    	 
    	 while(n>0) {
    		 r=n%10;
    		 n=n/10;
    		 sum=sum+r*r*r;
    		 
    		 
    	 }
    	 
    	 if(sum==temp) {
    		 System.out.println("is a armstrong number "); 
    	 }
    	 
    	 else {
    		 System.out.println("is not a armstrong number");
    	 }
    	 
    	 
    	 
    	
     }
	

}
