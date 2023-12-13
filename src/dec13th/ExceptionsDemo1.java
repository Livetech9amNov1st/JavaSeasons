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
		catch(Exception e)
		{
			//handling code or User friendly code
			System.out.println("please enter non-zero value for y");
			
		}
		
		System.out.println("End of Program");

	}

}
