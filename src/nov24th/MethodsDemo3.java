package nov24th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3.sumOfNaturalNumbers(5);
		MethodsDemo3.sumOfNaturalNumbers(10);
		MethodsDemo3.sumOfNaturalNumbers(100);
		MethodsDemo3.sumOfNaturalNumbers(1000);

	}
	
	public static void sumOfNaturalNumbers(int n)
	{
		int res=0;
		
		res=(n*(n+1))/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}

}
