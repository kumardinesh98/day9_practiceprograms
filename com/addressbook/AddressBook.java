package com.addressbook;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxContact = 100;
		int start = 0;
		int count = 0;
		int index =0;
		int mainloop = 1;
		int option;
		String first;
		String second;
		int contentIndex;
		Store store = new Store();
		store.addContent(start, maxContact);
		Values values = new Values();
		while (mainloop == 1) {
			
			System.out.println("[1]ADD NEW ADDRESS  [2] EDIT ADDRESS [3] DELET ADDRESS");
			option = scanner.nextInt();
			if(option <=0 || option >= 4) {
				System.out.println("please enter walid input");
			}
			switch (option) {
			case 1:
				while (count == 0) {
					System.out.println(index);
					String firstNmae = values.getFName();
					String LastName = values.getSName();
					String address = values.getAddress();
					String city = values.getcity();
					String state = values.getState();
					String zip = values.getzipcode();
					String phoneNumber = values.getmobile();
					String email = values.getemail();
					
					
					store.save(index,firstNmae, LastName, address, city, state, zip, phoneNumber, email);
					
					index = index+1;
					System.out.println("[1] to continue   [2] to break");
					int val = scanner.nextInt();
					if (val == 2) {
						count = 1;
					}
					else if(val<=0 || val >=3) {
						System.out.println("please enter valid input");
					}
				}
				break;
			case 2:
				 System.out.println("enter first name to edit");
				 first = scanner.next();
				 System.out.println("enter the second name");
				 second = scanner.next();
				 contentIndex = store.findContent(first, second);
				 if (contentIndex < 100) {
					store.editContact(contentIndex);
					String firstNmae = values.getFName();
					String LastName = values.getSName();
					String address = values.getAddress();
					String city = values.getcity();
					String state = values.getState();
					String zip = values.getzipcode();
					String phoneNumber = values.getmobile();
					String email = values.getemail();
					
					
					store.save(contentIndex,firstNmae, LastName, address, city, state, zip, phoneNumber, email);
					 
				 }
				 else {
					 System.out.println("please enter valid data");
				 }
				 break;
				 
			case 3:
				System.out.println("enter first name to edit");
				 first = scanner.next();
				 System.out.println("enter the second name");
				 second = scanner.next();
				 contentIndex = store.findContent(first, second);
				 if (contentIndex < 100) {
					 store.deletContent(contentIndex, contentIndex+1,maxContact);
				 	}
				
				 else {
					 System.out.println("please enter valid data");
				 }
				 break;
				 
				 
				 
			}
			
			System.out.println("[1] TO CONTINUE     [2]BREAK");
			int temp = scanner.nextInt();
			count = 0;
			if (temp == 2) {
				mainloop = 1;
				count = 1;
			}
			else if(count <=0 || count >=3){
				System.out.println("please enter valid input");
			}
			
		}

	}

}
