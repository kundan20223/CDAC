
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			int x=121;
			int temp=x;
			int rev=0;
			
			while(x>0) {
				int digit=x%10;
				rev=(rev*10) + digit;
				x=x/10;
			}
			
			if(rev==temp) {
				System.out.println("given number is palindrome");
			}
			
			else {
				System.out.println("given number is not palindrome");
			}
			
		}
}
		
	


