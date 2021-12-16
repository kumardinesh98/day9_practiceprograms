package com.addressbook;

import java.util.Arrays;

public class Store {
	String[]firstName = new String[100];
	String[]secondName = new String[100];
	String[]address = new String[100];
	String[]city = new String[100];
	String[]state = new String[100];
	String[]zip = new String[100];
	String[]phoneNumber = new String[100];
	String[]email = new String[100];
	
	Values values = new Values();
	
	
	public void addContent(int start, int totcount) {
		for (int i = start; i < totcount; i++) {
			firstName[i] = "null";
			secondName[i] = "null";
			address [i] = "null";
			city [i] = "null";
			state [i] = "null";
			zip [i] = "null";
			phoneNumber[i] = "null";
			email [i] = "null";
		}
	}
	
	
	
	public void save(int index, String firstName, String secondName, String address, String city, String state, String zip, String phoneNumber, String email ) {
		
		if (this.firstName[index].equals("null")) {
			this.firstName[index] = firstName;
			this.secondName[index] = secondName;
			this.address [index] = address;
			this.city [index] = city;
			this.state [index] = state;
			this.zip [index] = zip;
			this.phoneNumber[index] = phoneNumber;
			this.email [index] = email;
		}
		values.print(index,this.firstName, this.secondName, this.address, this.city, this.state, this.zip, this.phoneNumber, this.email);
	}
	public int findContent(String name1, String name2) {
		for (int i=0; i < 100; i++) {
			if(this.firstName[i] .equals(name1) && this.secondName[i] .equals(name2)) {
				return i;
			}
		}
		return 1001;
	}
	
	public void editContact(int indvalue) {
		this.firstName[indvalue] = "null";
	}
	public void deletContent(int ind , int max ,int memory) {
		addContent(ind,max);
		for (int i = ind; i < memory; i++) {
			if (ind == 99) {
				addContent(99,100);
			}
			this.firstName[ind] = this.firstName[ind+1] ;
			this.secondName[ind] = this.secondName[ind+1];
			this.address [ind] = this.address [ind+1];
			this.city [ind] = this.city [ind+1];
			this.state [ind] = this.state [ind+1];
			this.zip [ind] =this.zip [ind+1];
			this.phoneNumber[ind] = this.phoneNumber[ind+1];
			this.email [ind] =this.email [ind+1] ;
			
		}
		values.print(ind,this.firstName, this.secondName, this.address, this.city, this.state, this.zip, this.phoneNumber, this.email);
		
	}
	
	



}
