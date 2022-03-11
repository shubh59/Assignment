package assignment.day5.exp2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Mumbai");
		names.add("Bengalur");
		names.add("Hyderabad");
		names.add("Patna");
		names.add("Shimla");
		names.add("Ranchi");
		names.add("Raipur");
		names.add("Panji");
		names.add("Bhopal");
		names.add("Jaipur");
		System.out.println(names);
		System.out.println(names.contains("Mumbai"));
		names.remove("Bhopal");
		for(String name:names)
		{
				System.out.println(name);
		}
		
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println("Hello "+name);
		}

	}

}
