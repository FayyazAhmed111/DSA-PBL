package Assignment;

import java.util.Hashtable;

public class Problem2 {

	//TOP 5 METHOD
			public void top5(MyStack<String> stack,Hashtable<String, Universities> table) {
				MyStack<String> temp = stack;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 5 UNIVERSITIES*****");
				System.out.println();
				int j=5;
				for(int i=0; i<table.size();i++) {
					if(i<table.size()-5)
						{temp.pop();}
					else {
						String key=temp.pop();
						Universities obj = (Universities) table.get(key);
						System.out.println();
						System.out.println("Top "+j+" University");
						System.out.println("University Name:          " + obj.getName());
						System.out.println("University World Rank:    " + obj.getWr());
						System.out.println("University Asia Rank:     " + obj.getAr());
						System.out.println("University Pakistan Rank: " + obj.getPr());
						System.out.println("University Publications:  " + obj.getPub());
						System.out.println("University Locations:     " + obj.getLoc());
						System.out.println();
						--j;
					}
					
					}
				}// END OF TOP5
	
			
			
			
				//TOP 25 METHOD
				public void top25(MyStack<String> stack,Hashtable<String,Universities> table) {
				
				MyStack<String> temp = stack;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 25 UNIVERSITIES*****");
				System.out.println();
				int j=25;
				for(int i=0; i<table.size();i++) {
					if(i<table.size()-25)
						{temp.pop();}
					else {
						String key=temp.pop();
						Universities obj = (Universities) table.get(key);
						System.out.println();
						System.out.println("Top "+j+" University");
						System.out.println("University Name:          " + obj.getName());
						System.out.println("University World Rank:    " + obj.getWr());
						System.out.println("University Asia Rank:     " + obj.getAr());
						System.out.println("University Pakistan Rank: " + obj.getPr());
						System.out.println("University Publications:  " + obj.getPub());
						System.out.println("University Locations:     " + obj.getLoc());
						System.out.println();
						--j;
					}
					
					}
				} // END OF TOP25
			
			
				
				//50 PERCENTILE METHOD
				public void fiftypercentile(MyStack<String> stack,Hashtable<String,Universities> table) {
					MyStack<String> temp = stack;
					int size = temp.size();
					for(int i=0;i<size/2;i++)
						{temp.pop();}
					System.out.println("\t\t***50 Percentile***");
					Universities obj = (Universities) table.get(temp.pop());
					System.out.println("University Name:          " + obj.getName());
					System.out.println("University World Rank:    " + obj.getWr());
					System.out.println("University Asia Rank:     " + obj.getAr());
					System.out.println("University Pakistan Rank: " + obj.getPr());
					System.out.println("University Publications:  " + obj.getPub());
					System.out.println("University Locations:     " + obj.getLoc());
				}//END OF 50 PERCENTILE
				
			
	
}// END OF CLASS
