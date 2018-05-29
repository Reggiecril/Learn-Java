package com.classSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Chinese>list=new ArrayList<Chinese>();
		Chinese chinese1=new Chinese("primary","tom",12);
		Chinese chinese2=new Chinese("middle","jony",16);
		Chinese chinese3=new Chinese("hige","reg",19);
		list.add(chinese1);
		list.add(chinese2);
		list.add(chinese3);
		//sort by age DESC
		ageComparator a=new ageComparator();
		Collections.sort(list,a);
		for(Chinese chinese:list)
			System.out.println(chinese);
		System.out.println("++++++++++++++++++++++++++++++++++");
		//sort by name
		classComparator c=new classComparator();
		Collections.sort(list,c);
		for(Chinese chinese:list)
			System.out.println(chinese);
		System.out.println("++++++++++++++++++++++++++++++++++");
		//sort by age 
		Collections.sort(list);
		for(Chinese chinese:list)
			System.out.println(chinese);
	}
}
