package dec14th;

import java.awt.AWTException;
import java.util.Scanner;

public class ExceptionsDemo2 {

	public static void main(String[] args) throws InterruptedException,AWTException{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter some value for x : ");
		int x=input.nextInt();
		Thread.sleep(5000);
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
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			System.out.println("this is finally block ");
		}
		
		
		System.out.println("End of Program");

	}

}
