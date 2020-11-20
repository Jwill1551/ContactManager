import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
	public ArrayList<PersonContact> listOfContacts = new ArrayList<PersonContact>();
	
	public void addContact(PersonContact obj){
	//Adds a contact from the array list
		listOfContacts.add(obj);
		System.out.println("Added " + obj + " to the list of contacts." );
	}
	
	public void removeContact(Object obj) {
	//Removes a contact from the array list 
		listOfContacts.remove(obj);
		System.out.println("Removed " + obj + " from the list of contacts." );
	}
	
	public void displayContacts() {
	//Display all the current contacts located in the array list
		System.out.println("There are currently " + listOfContacts.size() + " contacts stored. Here is the list: ");
		for(int i = 0; i > listOfContacts.size(); i++) {
			listOfContacts.get(i);
		}
	}
	
	public void sortContacts(ArrayList listOfContacts) {
	//Sorts through all the elements located in the array list 
	  Collections.sort(listOfContacts);
	}
	
	public void searchContacts(Object obj) {
	//Search through all the elements for a specified element
	  int index = listOfContacts.indexOf(obj);
	  listOfContacts.get(index);
	}
	
	
}
