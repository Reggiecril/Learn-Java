package com.classSort;

import java.util.Comparator;

public class ageComparator implements Comparator<Chinese> {

	@Override
	public int compare(Chinese o1, Chinese o2) {
		int age =o1.getAge();
		
		int age1=o2.getAge();
		
		return age1-age;
	}

}
