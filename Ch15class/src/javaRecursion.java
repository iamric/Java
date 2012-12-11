
public class javaRecursion {

	/**
	 * @param args
	 */
	public static int fomulaGauss(int n){
		return (n * (n + 1)/2);
	}
	public static int loopGauss(int X){
		
		int sum = 0;
			for(int i = 1; i <= X; i++){
				sum = sum + 1;
			}
		return sum;
	}
	
	
	public  static int gaussTest(int M){
		if (M == 0 )
		{
			return M;
		}
		else if (M == 1){
			return M;
		}
		else {
			return (gaussTest(M - 1) + M);
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	 
	public static void Fibonacci(int a)
	{
		int n0 , n1 , n2; 
		n0 = a;
		n1 = n0;

	       for (int i = 0; i < 20; i++) 
	    	               {
	    	                 n2 = n1 + n0; 
	    	                 System.out.println(n2); 
	    	                 n0 = n1;  
	    	                 n1 = n2;  

	    	               }

	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toString(gaussTest(30)));
		System.out.println(Integer.toString(loopGauss(30)));
		System.out.println(Integer.toString(fomulaGauss(30)));
		//System.out.println(Integer.toString(fibonacci(30)));
		Fibonacci(5);
	}

}
