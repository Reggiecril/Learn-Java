package com.classSort;

import java.util.Comparator;

public class classComparator implements Comparator<Chinese> {
	


	public int compare(Chinese o1, Chinese o2) {
		String name1=o1.getName();
		String name2=o2.getName();
		int comp=name1.compareTo(name2);	
		return comp;
	}
}
