package nov24th;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj1=new MethodsDemo2();
		
		
		System.out.println(obj1.sumOfNaturalNumbers(5));
		System.out.println(obj1.sumOfNaturalNumbers(10));
		System.out.println(obj1.sumOfNaturalNumbers(100));
		System.out.println(obj1.sumOfNaturalNumbers(1000));
	}
	
	public int sumOfNaturalNumbers(int n)
	{
		int res=0;
		
		 res=(n*(n+1))/2;
		
		return res;
	}

}
