package Assignment;

import java.util.Hashtable;
import java.util.Scanner;

public class Problem3 {
	MyStack<String> temp;
	int sindh=0,punjab=0,balochistan=0,kpk=0,ict=0,others=0;
	String[] sindhh = 
		{"Hyderabad", "Karachi", "Khairpur", "Nawabshah", "Sukkur","Jamshoro","Tandojam"};
	String[] punjabb = 
		{"Bahawalpur", "Faisalabad", "Gujrat", "Haripur", "Lahore", "Mardan", "Multan", "Rawalpindi", "Sargodha", "Sialkot"}; 
	String[] kpkk = 
		{"Bannu", "Dera Ismail Khan", "Hazara", "Kohat", "Peshawar", "Swat", "Topi", "Totakan"};
	String[] balo = 
		{"Quetta"};
	String[] ist = 			
		{"Islamabad", "Taxila"};	    
	String[] other =		 
		{"Kashmir","Gilgit"};
	Hashtable <String,String> sindhtable = new Hashtable<>();
	Hashtable <String,String> punjabtable = new Hashtable<>();
	Hashtable <String,String> kpktable = new Hashtable<>();
	Hashtable <String,String> balotable = new Hashtable<>();
	Hashtable <String,String> isttable = new Hashtable<>();
	Hashtable <String,String> othertable = new Hashtable<>();
	
	public void checkperp(MyStack<String> stack,Hashtable <String,Universities> table) {
		 temp=stack.duplicate();
		 for(int i=0;i<table.size();i++) {
			 Universities obj = table.get(temp.pop());
			 String loc = obj.getLoc();	
			 for (String city : sindhh) {
			 if(loc.equals(city)) {
				 sindhtable.put(obj.getName(), loc);
				 sindh++; 
			 	}
			 }
			 for (String city : punjabb) {
				 if(loc.equals(city)) {
					 punjabtable.put(obj.getName(), loc);
					 punjab++; 
				 }
		 }	
			 for (String city :	kpkk) {
			 if(loc.equals(city)) {
				 kpktable.put(obj.getName(), loc);
				 kpk++; 
			 }
	 }
			 for (String city :	balo) {
				 if(loc.equals(city)) {
					 balotable.put(obj.getName(), loc);
					 balochistan++; 
				 }
		 }
			 for (String city :	ist) {
				 if(loc.equals(city)) {
					 isttable.put(obj.getName(), loc);
					 ict++; 
				 }
		 }
			 for (String city :	other) {
				 if(loc.equals(city)) {
					 
					 othertable.put(obj.getName(), loc);
					 others++; 
				 }
				 
		 }
			 
}// for loop end
		 System.out.println("Best performining province is "+findMaxp(kpk, punjab, balochistan, sindh, others, ict)+" with number of universities: "+ findMax(kpk, punjab, balochistan, sindh, others, ict));
		 System.out.println("Worst performining province is "+findMinp(kpk, punjab, balochistan, sindh, others, ict)+" with number of universities: "+ findMin(kpk, punjab, balochistan, sindh, others, ict));
		 System.out.println("Enter '1' to check best universites and '2' to check worst universities province wise and '0' to exit.");
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 if(x==1) {System.out.println(punjabtable);}
		 else if(x==2) {System.out.println(balotable);}
		 else if(x==0) {System.exit(0);}
	}//method end
	int findMax(int a, int b, int c, int d, int e,int f) {
		int max = a;
		String prov="Kpk";
		if (b > max) {
			max = b;
			prov="Punjab";
		}
		if (c > max) {
			max = c;
			prov="Balochistan";
		}
		if (d > max) {
			max = d;
			prov="Sindh";
		}
		if (e > max) {
			max = e;
			prov="Other(Gilgit,Kashmir)";
		}
		if (f > max) {
			max = f;
			prov="Islamabad capital territory";
		}
		return max;
	}
	String findMaxp(int a, int b, int c, int d, int e,int f) {
		int max = a;
		String prov="Kpk";
		if (b > max) {
			max = b;
			prov="Punjab";
		}
		if (c > max) {
			max = c;
			prov="Balochistan";
		}
		if (d > max) {
			max = d;
			prov="Sindh";
		}
		if (e > max) {
			max = e;
			prov="Other(Gilgit,Kashmir)";
		}
		if (f > max) {
			max = f;
			prov="Islamabad capital territory";
		}
		return prov;
	}
	int findMin(int a, int b, int c, int d, int e,int f) {
		int min = a;
		String prov="Kpk";
		if (b < min) {
			min = b;
			prov="Punjab";
		}
		if (c < min) {
			min = c;
			prov="Balochistan";
		}
		if (d < min) {
			min = d;
			prov="Sindh";
		}
		if (e < min) {
			min = e;
			prov="Other(Gilgit,Kashmir)";
		}
		if (f < min) {
			min = f;
			prov="Islamabad capital territory";
		}
		return min;
	}
	String findMinp(int a, int b, int c, int d, int e,int f) {
		int min = a;
		String prov="Kpk";
		if (b < min) {
			min = b;
			prov="Punjab";
		}
		if (c < min) {
			min = c;
			prov="Balochistan";
		}
		if (d < min) {
			min = d;
			prov="Sindh";
		}
		if (e < min) {
			min = e;
			prov="Other(Gilgit,Kashmir)";
		}
		if (f < min) {
			min = f;
			prov="Islamabad capital territory";
		}
		return prov;
	}
}

	