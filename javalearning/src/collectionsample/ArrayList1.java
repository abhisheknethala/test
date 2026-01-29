package collectionsample;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List l1= new ArrayList();
		l1.add("abhi");
		l1.add(20);
		System.out.println(l1);
		System.out.println(l1.remove(0));
		
		List <Integer>l2= new ArrayList<Integer>();
		l2.add(30);
		l2.add(40);
		System.out.println(l2.get(0));
		for(int i=0; i<l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		System.out.println(l2.remove(0));
		//traverse
		for(Integer n : l2) {
			System.out.println(n);
		}
	}

}
