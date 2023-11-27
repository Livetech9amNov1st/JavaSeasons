package nov27th;

public class Customer {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		//System.out.println(c1.balance);
		 System.out.println(c1.getBalance(3214));
		c1.setBalance(2000);
		System.out.println(c1.getBalance(3214));
	}
}
