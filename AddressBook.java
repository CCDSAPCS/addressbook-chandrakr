import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

	public void addContact(Contact c){
		friend[numfriends]=c;
		numfriends++;
	}
	
	
	public void printContacts90{
		for(int i=0; i,numfriends; i++)
			friends[i].printContact90;
	}
	
	public int numContacts(){
		return numfriends;
	}
	
	
	public int haveContacts(String s){
		for (int i =0; i< numfriends; i++)
		if (friends[i].getName().equals(s);{
		    return i;}
		    else {
		    return -1;
		    }
		    }
			
	public static void menu(){
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Delete a contact to your address book.");
		System.out.println("3.Print out the number of contacts you have.");
		System.out.println("4.Print out information of all your contacts.");
		System.out.println("5.Quit.");
		System.out.println("6.Enter your menu choice.");
		
