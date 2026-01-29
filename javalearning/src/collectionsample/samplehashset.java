package collectionsample;

import java.util.HashSet;
import java.util.Iterator;

public class samplehashset {
	public static void main(String[] args) {
		HashSet <String> hs= new HashSet<String>();
		hs.add("cricket");
		hs.add("volleyball");
		hs.add("kabadi");
		
		System.out.println(hs);
		System.out.println(hs.remove("kabadi"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		// traverse
		
		for(String out : hs) {
			System.out.println(out);
		}
		
		// iterator
		
		Iterator <String>  iter1 = hs.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		// lambda
		
		hs.forEach(i-> System.out.println(i));
		
		
	/*	HashSet<Integer> num=new HashSet<integer>();
		num.add(1);
		num.add(2);
		num.add(3);*/
		
		
		
	
		
		
	}

}
