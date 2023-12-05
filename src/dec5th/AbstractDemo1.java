package dec5th;

public class AbstractDemo1 {

	public static void main(String[] args) {
		
		//Cannot instantiate the type Numbers
		//new Numbers();
		
		Numbers obj=new Sum();
		
		obj.greet();
		obj.compute(10, 20);
		
		Numbers obj2=new Sub();
		obj2.compute(10, 20);

	}

}
