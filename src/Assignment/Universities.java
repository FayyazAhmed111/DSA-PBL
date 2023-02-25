package Assignment;
public class Universities {
	//********STEP 1********
	//attributes of university
	private String name;
	private String Wraning;
	private	String Aranking;
	private	String Pakranking;
	private	String location;
	private int publications;
	//constructor
	
	public Universities(String name,String Wranking,String Aranking,String Pakranking,String location,int publications) {
		this.name=name;
		this.Wraning=Wranking;
		this.Aranking=Aranking;
		this.Pakranking=Pakranking;
		this.location=location;
		this.publications=publications;
	}
	//get functions
	public String getName() {
		return name;
	}
	public String getWr() {
		return Wraning;
	}
	public String getAr() {
		return Aranking;
	}
	public String getPr() {
		return Pakranking;
	}
	public String getLoc() {
		return location;
	}
	public int getPub() {
		return publications;
	}
}
