package nov24th;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		System.out.println(MethodsDemo4.sumOfNaturalNumbers(5));
		System.out.println(MethodsDemo4.sumOfNaturalNumbers(10));
		System.out.println(MethodsDemo4.sumOfNaturalNumbers(100));
		System.out.println(MethodsDemo4.sumOfNaturalNumbers(1000));

	}
	
	public static int sumOfNaturalNumbers(int n)
	{
		int res=0;
		
		res=(n*(n+1))/2;
		
		return res;
	}

}
