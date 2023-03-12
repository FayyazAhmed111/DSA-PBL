package Assignment;

import java.util.Hashtable;
import java.util.Scanner;

public class Problem2 {
	
		public void topx(MyStack<String> stack,Hashtable<String,Universities> table ) {
			System.out.println("enter top x value: ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			MyStack<String> temp = stack.duplicate();
			System.out.println("\t\t*****TOP "+x+" UNIVERSITIES*****");
			System.out.println();
			int j=1;
			for(int i=1;i<table.size();i++) {
				if(i>x)temp.pop();
				else {
					String key = temp.pop();
					Universities obj = (Universities) table.get(key);
					System.out.println("Top "+j+" Universities");
					System.out.println("Universities name: " + obj.getName());
					System.out.println("University World Rank:    " + obj.getWr());
					System.out.println("University Asia Rank:     " + obj.getAr());
					System.out.println("University Pakistan Rank: " + obj.getPr());
					System.out.println("University Publications:  " + obj.getPub());
					System.out.println("University Locations:     " + obj.getLoc());
					System.out.println();
					j++;
				}
			}
		}

	//TOP 5 METHOD
			public void top5(MyStack<String> stack,Hashtable<String, Universities> table) {
				MyStack<String> temp=stack.duplicate();  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 5 UNIVERSITIES*****");
				System.out.println();
				int j=1;
				for(int i=1; i<=table.size();i++) {
					if(i>5)
						{temp.pop();}
					else {
						String key=temp.pop();
						Universities obj = (Universities) table.get(key);
						System.out.println("Top "+j+" University");
						System.out.println("University Name:          " + obj.getName());
						System.out.println("University World Rank:    " + obj.getWr());
						System.out.println("University Asia Rank:     " + obj.getAr());
						System.out.println("University Pakistan Rank: " + obj.getPr());
						System.out.println("University Publications:  " + obj.getPub());
						System.out.println("University Locations:     " + obj.getLoc());
						System.out.println();
						j++;
					}
					
					}
				}// END OF TOP5
	
			
			
			
				//TOP 25 METHOD
				public void top25(MyStack<String> stack,Hashtable<String,Universities> table) {
				
					MyStack<String> temp=stack.duplicate();  // Using temporary stack to avoid data loss
					System.out.println("\t\t*****TOP 25 UNIVERSITIES*****");
					System.out.println();
					int j=1;
					for(int i=1; i<=table.size();i++) {
						if(i>25)
							{temp.pop();}
						else {
							String key=temp.pop();
							Universities obj = (Universities) table.get(key);
							System.out.println("Top "+j+" University");
							System.out.println("University Name:          " + obj.getName());
							System.out.println("University World Rank:    " + obj.getWr());
							System.out.println("University Asia Rank:     " + obj.getAr());
							System.out.println("University Pakistan Rank: " + obj.getPr());
							System.out.println("University Publications:  " + obj.getPub());
							System.out.println("University Locations:     " + obj.getLoc());
							System.out.println();
							j++;
						}
					}
				} // END OF TOP25
			
			
				//BOTTOM 5 METHOD
				public void btm5(MyStack<String> stack,Hashtable<String, Universities> table) {
					MyStack<String> temp=stack.duplicate();  // Using temporary stack to avoid data loss
					System.out.println("\t\t*****BOTTOM 5 UNIVERSITIES*****");
					System.out.println();
					int j=96;
					for(int i=1; i<=table.size();i++) {
						if(i<96)
							{temp.pop();}
						else {
							String key=temp.pop();
							Universities obj = (Universities) table.get(key);
							System.out.println("Top "+j+" University");
							System.out.println("University Name:          " + obj.getName());
							System.out.println("University World Rank:    " + obj.getWr());
							System.out.println("University Asia Rank:     " + obj.getAr());
							System.out.println("University Pakistan Rank: " + obj.getPr());
							System.out.println("University Publications:  " + obj.getPub());
							System.out.println("University Locations:     " + obj.getLoc());
							System.out.println();
							j++;
						}
						
						}
					}// END OF TOP5
				
				//50 PERCENTILE METHOD
				public void fiftypercentile(MyStack<String> stack,Hashtable<String,Universities> table) {
					int size =table.size();
					MyStack<String> temp=stack.duplicate();
					for(int i=1;i<size/2;i++)
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
