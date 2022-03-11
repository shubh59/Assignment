package assignment.day5.exp1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
	public static void main(String[] args) {
		List<String> names=new LinkedList<String>();
		names.add("Tony Stark");
		names.add("Deadpool");
		names.add("Thor");
		names.add("Naruto Uzumaki");
		names.add("Itachi Uchiha");
		names.add("Saitama");
		System.out.println(names);
		
		names.add(3,"Goku");
		
		System.out.println(names.get(5));
				names.remove(2);
		System.out.println(names);
		System.out.println(names.contains("Itachi Uchiha"));
		
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println("Hello "+name);
		}
		

	}


}
