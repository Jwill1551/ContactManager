/*The BaseContact Class will be an abstract class that will give the business and the Person class access to it's properties
  , such as the person class taking the name property for each person or the business class taking the name property to 
  store multiple names in an array of employees*/

// This class will also be relying on properties from the photo class to store data in the array called "listOfPhotos"

import java.util.ArrayList;

public abstract class BaseContact {
	public String name;
	public int number;
	public String phoneNumber;
	public ArrayList<Photo> listOfPhotos = new ArrayList<Photo>();
	public String location;
	
	public BaseContact(){
		
	}
	
	public BaseContact(String name, int number, String phoneNumber, String location) {
		this.name = name;
		this.number = number;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
