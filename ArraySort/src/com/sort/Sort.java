package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	
	
	public static void main(String []args) {
		List<Integer> list= new ArrayList<Integer>();
		for(int x=10;x>0;x--)
			list.add(x);
		
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		
		List<String> list1= new ArrayList<String>();
		list1.add("blue");
		list1.add("Green");
		list1.add("Orabge");
		list1.add("red");
		
		Collections.sort(list1);
		for(String i:list1) {
			System.out.println(i);
		}
		
		
		
	}
}
