package org.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Convert {
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(Arrays.toString(a));
		for (Integer x : a) {
			System.out.println(x);

		}
		List<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);

		Set<Integer> s = new LinkedHashSet<Integer>();

		s.add(30);
		s.add(20);
		s.add(500);

		s.add(40);
		s.add(500);

		System.out.println(s);
		
		Map<Integer, String> m  = new HashMap<>();
		
		m.put(30, "Nis");
		m.put(40, "Ragu");
		m.put(500, "Robin");
		System.out.println(m);
		
		System.out.println(m.entrySet());
		
	Set<Entry<Integer, String>> m1 = m.entrySet();
	for (Entry<Integer, String> en : m1) {
		System.out.println(en.getKey());
		System.out.println(en.getValue());
		
	}
	
			
		}
//		Set<Entry<Integer, Integer>> m1 = m.entrySet();
//		for (Entry<Integer, Integer> en : m1) {
//			System.out.println(en.getKey()+"30");
//			System.out.println(en.getKey()+"20");
//			System.out.println(en.getKey()+"500");
//			System.out.println(en.getValue().getInteger("Nis"));
//			System.out.println(en.getValue().getInteger("Venk"));
//			
		}
			
		
		


		
		
		
		
		
	
	


