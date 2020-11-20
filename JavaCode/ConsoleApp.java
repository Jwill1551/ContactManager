import java.util.Scanner;

public class ConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonContact Josh = new PersonContact("Joshua", "08/27/1999", "I am a software developer in Phoenix, AZ", 1);
		PersonContact Jill = new PersonContact("Jill", "09/12/2001", "The sibling of Josh", 1);
		PersonContact Bill = new PersonContact();
		BusinessContact IT = new BusinessContact(40, 80000, "Information Technology");
		Location myLocation = new Location("706 South Flower St", "Inglewood", "CA", 90301);
		
		Josh.relatives.add(Jill);
		Josh.relatives.add(Bill);
		Jill.relatives.add(Josh);
		Jill.relatives.add(Bill);
		Bill.relatives.add(Josh);
		Bill.relatives.add(Jill);
		
		Josh.phoneNumber= "323-441-8903";
		Jill.phoneNumber= "434-825-1069";
		Josh.wasBornOn(Josh.name, Josh.dateOfBirth);
		Jill.wasBornOn(Jill.name, Jill.dateOfBirth);
		Josh.location = myLocation.fullLocation;
		Jill.location = myLocation.fullLocation;
		
		AddressBook contactBook = new AddressBook();
		Scanner kb = new Scanner(System.in);
		
		
			System.out.println("Welcome to the contact access menu, you can use the following options: ");
			System.out.println("*Create Contact ==> create*");
			System.out.println("*Show All Contacts ==> show*");
			System.out.println("*To Exit ==> exit*");
			String userRes = kb.next();
				
			if(userRes == "create") {
			   System.out.println("Please enter a name for the new contact: ");
			   String contactName = kb.next();
			   
			   PersonContact person = new PersonContact();
			   
			   System.out.println("What is the name of the contact?");
			   String userName = kb.next();
			   person.setName(userName);
			   
			   System.out.println("What is the date of birth?");
			   String DOB = kb.next();
			   person.dateOfBirth = DOB;
			   
			   System.out.println("What is the description of the contact?");
			   String desc = kb.next();
			   person.desc = desc;
			   
			   contactBook.addContact(person);
			   
			   System.out.println("Contact " + person.name + " is created!");
			} else if(userRes == "show") {
			   System.out.println("Here is the list of contacts: ");
			   contactBook.displayContacts();
			} else {
				System.out.println("If you are finished please enter 'exit', to exit the program");
			}
		
	}

}
