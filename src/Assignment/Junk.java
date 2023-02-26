package Assignment;

import java.util.Hashtable;

// JUNK CLASS TO CHECK METHODS

public class Junk {

	//TOP 5 PUBLICATIONS
			public static void top5pub(MyStack stack,Hashtable table) {
				
				MyStack<String> temp = stack;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 5 UNIVERSITIES ACCORDING TO PUBLICATIONS*****");
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
				}// END OF TOP5PUB
			
			//TOP 5 PAKISTANI RANKED UNIVERSITIES
			public static void top5pkrank(MyStack stack1,Hashtable table) {
				
				MyStack<String> temp = stack1;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 5 UNIVERSITIES ACCORDING TO PAKISTANI RANKING*****");
				System.out.println();
				int j=5;
				for(int i=0; i<table.size();i++) {
					if(i<table.size()-5)
						{temp.pop();}
					else {
						Universities obj = (Universities) table.get(temp.pop());
						System.out.println("Top "+ j +" University");
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
				}//END OF TOP5PKRANK
				
				//TOP 5 PUBLICATIONS
				public static void top25pub(MyStack stack,Hashtable table) {
				
				MyStack<String> temp = stack;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 25 UNIVERSITIES ACCORDING TO PUBLICATIONS*****");
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
				}// END OF TOP25PUB
			
				//TOP 25 PAKISTANI RANKED UNIVERSITIES
				public static void top25pkrank(MyStack stack1,Hashtable table) {
				
				MyStack<String> temp = stack1;  // Using temporary stack to avoid data loss
				System.out.println("\t\t*****TOP 25 UNIVERSITIES ACCORDING TO PAKISTANI RANKING*****");
				System.out.println();
				int j=25;
				for(int i=0; i<table.size();i++) {
					if(i<table.size()-25)
						{temp.pop();}
					else {
						Universities obj = (Universities) table.get(temp.pop());
						System.out.println("Top "+ j +" University");
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
				}//END OF TOP25PKRANK
				
				//50 PERCENTILE ACCORDING TO PUBLICATIONS
				public static void fiftypercentilepub(MyStack stack,Hashtable table) {
					int size = stack.size();
					MyStack<String> temp = stack;
					for(int i=0;i<size/2;i++)
						{temp.pop();}
					System.out.println("50 Percentile According to Publication: ");
					Universities obj = (Universities) table.get(temp.pop());
					System.out.println("University Name:          " + obj.getName());
					System.out.println("University World Rank:    " + obj.getWr());
					System.out.println("University Asia Rank:     " + obj.getAr());
					System.out.println("University Pakistan Rank: " + obj.getPr());
					System.out.println("University Publications:  " + obj.getPub());
					System.out.println("University Locations:     " + obj.getLoc());
				}
				
				//50 PERCENTILE ACCORDING TO PAKISTAN RANKING
				public static void fiftypercentilepkr(MyStack stack1,Hashtable table) {
					int size = stack1.size();
					MyStack<String> temp = stack1;
					for(int i=0;i<size/2;i++)
						{temp.pop();}
					System.out.println();
					System.out.println("50 Percentile According to Ranking: ");
					Universities obj = (Universities) table.get(temp.pop());
					System.out.println("University Name:          " + obj.getName());
					System.out.println("University World Rank:    " + obj.getWr());
					System.out.println("University Asia Rank:     " + obj.getAr());
					System.out.println("University Pakistan Rank: " + obj.getPr());
					System.out.println("University Publications:  " + obj.getPub());
					System.out.println("University Locations:     " + obj.getLoc());
				}//END OF METHOD
	
}
