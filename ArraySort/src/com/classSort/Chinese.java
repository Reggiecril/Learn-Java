package com.classSort;

public class Chinese implements Comparable<Chinese>{
	private String grader;
	private String name;
	private int age;
	
	public Chinese(String grader,String name,int age) {
		this.setAge(age);
		this.setGrader(grader);
		this.setName(name);
	}
	public String getGrader() {
		return grader;
	}
	public void setGrader(String grader) {
		this.grader = grader;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Chinese [grader=" + grader + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Chinese o) {
		int age1=this.getAge();
		int age2=o.getAge();
		return age1-age2;
	}

}
