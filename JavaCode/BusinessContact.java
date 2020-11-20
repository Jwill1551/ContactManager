/*The Business Contact will hold all the information and properties of employment and work, such as the person class using this class to
  class's properties to give an object or individual the status of a certain job or detail of their salary*/ 

import java.util.ArrayList;

public class BusinessContact extends BaseContact {
	public int businessHours;
	private ArrayList<PersonContact> employees = new ArrayList<PersonContact>();
	public int numberOfEmployees = employees.size();
	public double salary;
	public String typeOfWork;
	public String websiteURL;
	
	//Business Contact Class Constructor
	public BusinessContact() { }
	
	public BusinessContact(int businessHours, double salary, String typeOfWork) 
	{ 
		this.businessHours = businessHours;
		this.salary = salary;
		this.typeOfWork = typeOfWork;
	} 
	
	//Verifys whether the object of the Person Contact is working
	public void isWorking() {
		System.out.println("The number of Employees working is " + numberOfEmployees);
		System.out.println("List of Employees working: ");
		for(PersonContact people : employees) {
			System.out.println(people.name);
		}
	}
	
	//Removes an object from the employees array list
	
	public void isFired(PersonContact obj){
		employees.remove(obj);
	}
	
	public void addEmployee(PersonContact obj) {
		employees.add(obj);
	}
	
}


