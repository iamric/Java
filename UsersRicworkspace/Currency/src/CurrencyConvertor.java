
public class CurrencyConvertor {

	// Data items
	
	private double ConFac;
	
	// Constructors
	
	public CurrencyConvertor()  // no parameters
	{
		ConFac = 1.0;
	}
	
	public CurrencyConvertor(double CF)  // one parameter
	{
		ConFac = CF;
	}
	
	// Methods
	
	public double FromUs(double amt)
	{
		double ans = amt * ConFac ;
		
		return ans;
	}
	
	public double ToUs(double amt)
	{
		double ans = amt / ConFac ;
		
		return ans;
	}
	
	public void SetCF(double CF)
	{
		ConFac = CF;
	}
	
	public static void main(String[] args) 
	{
		CurrencyConvertor MexCC, EUCC;
		
		MexCC = new CurrencyConvertor(10.0);
		EUCC = new CurrencyConvertor(.5675);
		
		
		System.out.println(MexCC.ToUs(100));
		System.out.println(EUCC.FromUs(100));
		
	}

}
