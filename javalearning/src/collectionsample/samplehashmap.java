package collectionsample;

//import java.security.KeyStore.Entry;
import java.util.HashMap; 
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.*;

public class samplehashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer , String>();
		hm1.put(0, "abhi");
		hm1.put(1, "roy");
		hm1.put(2, "madhu");
		
		System.out.println(hm1.get(1));
		
		Set s1= hm1.entrySet();//assinging hm1 to s1 through using set method
		Iterator iter= s1.iterator();//assinging set s1 to iter for iterating in while loop
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("second traverse method");
		for(Entry<Integer, String> entry : hm1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
