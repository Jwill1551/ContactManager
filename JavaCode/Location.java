//This class contains the location information for each value in the person class
public class Location {
	public String region;
	public String city;
	public String street;
	public String state;
	public int zipCode;
	public String weather;
	public String fullLocation = street + ", " + city + ", " + state + " " + zipCode;
	
	public Location() { }
	public Location(String street, String city, String state, int zipCode) { 
		this.state = state;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}
	
	public void retrieveAddress(String state, String city, String street, int zipCode) {
		System.out.println(street + " ," + city + " ," + state + zipCode);
	}
	
	
	public void weatherForecast(String weather) {
		System.out.println("It is going to be " + weather + " toaday!");
	}
}
