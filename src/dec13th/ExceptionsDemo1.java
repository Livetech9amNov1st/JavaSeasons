package dec13th;

import java.util.Scanner;

public class ExceptionsDemo1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter some value for x : ");
		int x=input.nextInt();
		System.out.println("Enter some value for y : ");
		int y=input.nextInt();
		
		try
		{
			//risky code 
		int z=x/y;
			
		System.out.println("Quotient is "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			//handling code or User friendly code
			System.out.println("please enter non-zero value for y");
			
		}
		
		System.out.println("End of Program");

	}

}
