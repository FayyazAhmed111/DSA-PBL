package Assignment;

import java.util.Hashtable;

public class Problem3 {
	MyStack<String> temp;
	public void checkperp(MyStack<String> stack,Hashtable <String,Universities> table) {
		 temp=stack.duplicate();
		 int sindh=0,punjab=0,balochistan=0,kpk=0,gilgit=0,kashmir=0,ICT=0;
		 String[] sindhh = 
				 	{"Hyderabad", "Karachi", "Khairpur", "Nawabshah", "Sukkur","Jamshoro","Tandojam"};
		 String[] punjabb = 
				    {"Bahawalpur", "Faisalabad", "Gujrat", "Haripur", "Lahore", "Mardan", "Multan", "Rawalpindi", "Sargodha", "Sialkot"}; 
		 String[] kpkk = 
				    {"Bannu", "Dera Ismail Khan", "Hazara", "Kohat", "Peshawar", "Swat", "Topi", "Totakan"};
		 String[] balo = 
				    {"Quetta"};
		 String[] gl =
				    {"Gilgit"};
		 String[] ist = 			
		 			{"Islamabad", "Taxila"};	    
		 String[] kashmirr =		 
					{"Kashmir"};
				

			 for (int i = 0; i < table.size(); i++) {
			 String key = temp.pop();	
			 Universities obj  = (Universities) table.get(key);
			 String loc = obj.getLoc();
			 for(int j=0;j<sindhh.length;j++) {	
			 if(loc.equals(sindhh[j]))
					 sindh++;
			 			
			 }
			 for(int j=0;j<kpkk.length;j++) {	
				 if(loc.equals(kpkk[j]))
						 kpk++;
				 }
			 for(int j=0;j<punjabb.length;j++) {	
				 if(loc.equals(punjabb[j]))
						 punjab++;
				 }
			 for(int j=0;j<gl.length;j++) {	
				 if(loc.equals(gl[j]))
						 gilgit++;
				 }
			 for(int j=0;j<kashmirr.length;j++) {	
				 if(loc.equals(kashmirr[j]))
						 kashmir++;
				 }
			 for(int j=0;j<balo.length;j++) {	
				 if(loc.equals(balo[j]))
						 balochistan++;
				 }
			 for(int j=0;j<ist.length;j++) {	
				 if(loc.equals(ist[j]))
						 ICT++;
				 }
		
		}
		 System.out.println("Uni in sindh = "+ sindh);
		 System.out.println("Uni in	punjab= "+ punjab);
		 System.out.println("Uni in kpk = "+ kpk);
		 System.out.println("Uni in balochistan = "+ balochistan);
		 System.out.println("Uni in kashmir = "+ kashmir);
		 System.out.println("Uni in Islamabad = "+ ICT);
		 System.out.println("Uni in gilgit = "+ gilgit);
		 
	}
}

	