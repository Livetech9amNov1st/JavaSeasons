package nov24th;

public class MethodsDemo1 {

	public static void main(String[] args) {
		
		MethodsDemo1 obj1=new MethodsDemo1();
		
		obj1.sumOfNaturalNumbers(5);
		obj1.sumOfNaturalNumbers(10);
		obj1.sumOfNaturalNumbers(100);
		obj1.sumOfNaturalNumbers(1000);

	}
	
	public void sumOfNaturalNumbers(int n)
	{
		int res=0;
		
		res=(n*(n+1))/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}

}
