package collection.practice04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorPractice {

	public void practice01() {
		
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("사당", "2호선");
		hm.put("공덕", "6호선");
		hm.put("충무로", "4호선");
		hm.put("왕십리", "5호선");
		hm.put("노량진", "9호선");
		
		hm.put("사당", "4호선");
		
		hm.remove("충무로");
		
		Set st = hm.keySet();
		
		Iterator<String> iter = st.iterator();
		
		while(iter.hasNext()) {
			String temp = iter.next();
					
			System.out.println(temp + " = " + hm.get(temp));
		}
		
		System.out.println();
		
		Set<Map.Entry<String,String>> st2 = hm.entrySet();
		
		Iterator<Entry<String, String>> iter2 = st2.iterator();
		
		while(iter2.hasNext()) {

			Map.Entry<String, String> ent = iter2.next();
			
			System.out.println(ent.getKey() + " = " + ent.getValue());
		}
		
	}
	
	
	
}