package nov27th;

public class Bank {
	
	private double balance=10000;
	
	//getters
	public double getBalance(int pin)
	{
		//validation
		
		if(pin == 3214)
		{
			//System.out.println("balance is "+balance);
			return balance;
		}
		else
		{
			System.out.println("Invalid pin..");
			return 0.0;
		}
		
	}
	
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	

}
