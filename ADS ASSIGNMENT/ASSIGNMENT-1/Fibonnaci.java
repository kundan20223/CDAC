
public class Fibonnaci {
	
	static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-g
		int num=5;
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(fib(i)+" ");
		}
		
	}

}
