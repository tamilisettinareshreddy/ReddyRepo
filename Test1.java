package com.naresh;

public class Test1 implements Inter{
	private String name;
	private int age;
	@Override
	public void getDetails(String name, int age) {
		System.out.println("Test1 : getDetails method | Entry");
		// TODO Auto-generated method stub
		System.out.println("Test : getDetails method | Exit");
	}
	
	@Override
	public void addData(String address1,String zip,String city,String state,String country){
		System.out.println("Test1 : getData method | Entry");
		System.out.println("Address is :"+address1+"Zip code is :"+zip+"City is "+city+"State is "+state+"Country is "+country);
		System.out.println("Test1 : getData method | Exit");
	}
	public Test1() {
	}
	public Test1(String name, int age) {
		System.out.println("Test1 : 0-arg constructor");
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		System.out.println("Test : main() method");
		Test1 t =  new Test1("naresh",28);
		System.out.println("Name is :"+t.name+"\t"+"age age is :"+t.age);
		System.out.println("Kotha Isukapalli,U.Kothapalli Mandal,E.G.Dt.","533450","Kakinada","Andhra Pradesh","India");
	}

}
