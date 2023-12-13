package dec13th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		hs.add("Selenium");
		
		hs.add("Live Tech");
		
		hs.add("TOSCA");
		
		hs.add("Appium");
		
		hs.add("Cypress");
		
		hs.add("Selenium");
		
		hs.add("Live Tech");
		
		hs.add("TOSCA");
		
		hs.add("Appium");
		
		hs.add("Cypress");
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		

	}

}
