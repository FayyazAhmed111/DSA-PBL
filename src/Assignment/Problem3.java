package Assignment;

import java.util.Hashtable;

public class Problem3 {
	MyStack<String> temp;
	public void checkper(MyStack<String> stack,Hashtable <String,Universities> table) {
		 temp=stack.duplicate();
		 String[][] cities = {
				    // Punjab
				    {"Bahawalpur", "Faisalabad", "Gujrat", "Haripur", "Lahore", "Mardan", "Multan", "Rawalpindi", "Sargodha", "Sialkot"},  
				    // Khyber Pakhtunkhwa
				    {"Bannu", "Dera Ismail Khan", "Hazara", "Kohat", "Peshawar", "Swat", "Topi", "Totakan"},
				    // Sindh
				    {"Hyderabad", "Karachi", "Khairpur", "Nawabshah", "Sukkur","Jamshoro","Tandojam"},
				    // Balochistan
				    {"Quetta"},
				    // Gilgit-Baltistan
				    {"Gilgit"},
				    // Islamabad Capital Territory
				    {"Islamabad", "Taxila"},
				    //Other
				    {"Kashmir"}
				};

		 for (int i = 0; i < stack.size(); i++) {
			 String key = temp.pop();	
			 Universities obj  = (Universities) table.get(key);
			 //obj.get
		
		}
		 
	}
}
