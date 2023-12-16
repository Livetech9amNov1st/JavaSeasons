package dec14th;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException()
	{
		super("Your Age is less than 18 .. Not eligible for voting..");
	}
}
