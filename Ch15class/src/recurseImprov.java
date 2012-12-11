
public class recurseImprov {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n = 7;
		System.out.println(Fib(n));
		System.out.println(Fib2(n));

	}
	
	public static int Fib(int n)
	{
		if ((n == 1)||(n==2))
		{
			return 1;
		}
		int oneback = 1;
		int twoback = 1;
		int temp = 0;
		for (int i = 3; i <= n; i++)
		{
			temp = oneback + twoback;
			oneback = twoback;
			twoback = temp;
		}
	    return temp;
	}
	
	public static int Fib2(int n)
	{
		if ((n == 1)||(n==2))
		{
			return 1;
		}
		int a, b;
		System.out.println("going left " + (n-2));
		a = Fib2(n - 2); 
		System.out.println("going right with " + (n-1));
		b = Fib2(n - 1);
	    return (a + b);
	}
}
