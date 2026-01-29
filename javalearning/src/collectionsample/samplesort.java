package collectionsample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class samplesort {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
	//	System.out.println("sorted list" + l1);
		
		List<String> l2 = new ArrayList<String>();
		l2.add("abhi");
		l2.add("roy");
		l2.add("dillu");
		
		List l3 = new ArrayList();
		l3.add("abhi");
		l3.add(20);
		l3.add("tadepalligudem");
		
		
		Collections.sort(l1);
		System.out.println("sorted list is" + l1);
		
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println( "decending  list of l2" + l2);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("decending  list of l1" + l1);
		
		//Collections.sort(l3,Collections.reverseOrder());
		System.out.println(l3);
		
		
	}

	
}
