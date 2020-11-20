//The purpose of the PersonContact Class is to have a class that holds properties of a individual or person. 
//For example this class contains properties for the information of a single individual like their date of birth or their number of relatives.
import java.util.ArrayList;

public class PersonContact extends BaseContact {
	 String dateOfBirth;
	 String desc;
	 ArrayList<PersonContact> relatives = new ArrayList<PersonContact>();
	 int numberOfRelatives = relatives.size();
	 boolean working;
	 
	 PersonContact(){ }
	 
	 PersonContact(String name, String dateOfBirth, String desc, int numberOfRelatives){
	   this.dateOfBirth = dateOfBirth;
	   this.desc = desc;
	   this.numberOfRelatives = numberOfRelatives;
	 }
	
	 public void isEmployed(boolean working) {
		 if (working) {
			 System.out.println("They are employed");
		 } else {
			 System.out.println("They are not employed.");
		 }
		 
	 }
	 
	 public void wasBornOn(String name , String dateOfBirth) {
		System.out.println(name + " was born on " + dateOfBirth);
	 }
	 
	 public String getDateOfBirth(){
		 return dateOfBirth;
	 }
	 
	 private void setDateOfBirth(String dateOfBirth) {
		 this.dateOfBirth = dateOfBirth;
	 }
	 
	 public void nameRelative(PersonContact obj) {
		 relatives.add(obj);
	 }
	 
	 public void displayRelatives() {
		 System.out.println("There relatives are: ");
		 for(PersonContact relative: relatives) {
			 System.out.println(relative);
		 }
	 }
	 
	 public void currentCareer() {
		 
	 }
	 
}
