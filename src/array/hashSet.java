package array;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
	// hasset doest accept duplicate value
	// no guarentee that elements stored is sequential
	public static void main(String[] args) {
		HashSet<String> sm = new HashSet<String>();
		sm.add("nepal");
		sm.add("india");
		sm.add("sanam");
//		sm.remove("sanam");
		System.out.println(sm);
		System.out.println(sm.isEmpty());

		// iterative
		Iterator<String> i = sm.iterator();
		while (i.hasNext())
			System.out.println(i.next());

	}
}
