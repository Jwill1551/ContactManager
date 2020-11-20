//This class will contain data and variables for the creation of a photo contact for each person created as an object

public class Photo {
	public String photoID;
	public String fileName;
	public String fileType;
	public String dataOfPhoto;
	public String desc;
	public String unitOfMeasurement;
	public int width;
	public int height;
	
	Photo() {
		
	}
	
	Photo(String photoID, String fileName, String fileType, String dataOfPhoto, String desc, String unitOfMeasurement, int width, int height){
		this.photoID = photoID;
		this.fileName = fileName;
		this.fileType = fileType;
		this.dataOfPhoto = dataOfPhoto;
		this.desc = desc;
		this.unitOfMeasurement = unitOfMeasurement;
		this.width = width;
		this.height = height;
	}
	
	
}
