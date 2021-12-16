package com.addressbook;

import java.util.Scanner;

public class Values {
	Scanner scanner = new Scanner(System.in);
	public String  getFName() {
		System.out.println("enter the first name :");
		String first = scanner.next();
		return first;
	}
	public String  getSName() {
		System.out.println("enter the second name :");
		String second = scanner.next();
		return second;
	}
	public String  getAddress() {
		System.out.println("enter the address :");
		String add = scanner.next();
		return add;
	}
	public String  getcity() {
		System.out.println("enter the city :");
		String city = scanner.next();
		return city;
	}
	public String  getState() {
		System.out.println("enter the state :");
		String state = scanner.next();
		return state;
	}
	public String  getzipcode() {
		System.out.println("enter the zipcode");
		String zipcode = scanner.next();
		return zipcode;
	}
	public String  getmobile() {
		System.out.println("enter the mobile number ");
		String number = scanner.next();
		return number;
	}
	public String  getemail() {
		System.out.println("enter the mail id");
		String mail = scanner.next();
		return mail;
	}
	public void print(String data) {
		System.out.println(data);
	}
	public void print(int ind,String[] fname, String[] sname,String[] address,String[] city,String[] state,String[] zipcode,String[] num,String[] email) {
		for (int j= 0; j <100;j++) {
			if (fname[j] != "null") {
				System.out.println(ind);
				System.out.println("name: "+fname[j]);
				System.out.println("second name; "+sname[j]);
				System.out.println("adress: "+address[j]);
				System.out.println("city: "+city[j]);
				System.out.println("state: "+state[j]);
				System.out.println("zipcode: "+zipcode[j]);
				System.out.println("mobile number: "+num[j]);
				System.out.println("e mail: "+email[j]);
				System.out.println("====================================");
			}
				
		}
	}
	
}
