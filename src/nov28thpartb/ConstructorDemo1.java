package nov28thpartb;

public class ConstructorDemo1 {

	public static void main(String[] args) {
		
		//user1
		
		Clock c1=new Clock();
		c1.getClock();
		
		//user2
		
		Clock c2=new Clock(10,5,45);
		c2.getClock();

	}

}
