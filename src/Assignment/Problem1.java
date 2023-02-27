package Assignment;

import java.util.Hashtable;
import java.util.Scanner;

public class Problem1 {
	//METHOD TO SEARCH OBJECTS WITHOUT COLLISIONS
	//****STILL INCOMPLETE COLLISION PART AND GUI OUTPUT PART*****
	public void searchwithoutcol(Hashtable<String,Universities> table) {
		
		//GETTING KEY FROM USER
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 4 letter keyword: ");
			String key = scan.nextLine();
			//TO CHECK KEY IS 4 LETTER
			if (key.length()!=4) {
				while(key.length()!=4) {
					System.out.println("Key should be 4 letter, Enter Key Again: ");
					key = scan.nextLine();
				}
			}
			//GIVING DETAILS FOR KEYS
			while(!table.containsKey(key)) {
				System.out.println("KEY doesn't exsist, Enter key Again: ");
				key = scan.nextLine();
				if(key.length()!=4) {
					System.out.println("Key should be 4 letter, Enter Key Again: ");	
					key = scan.nextLine();						
				}
			}
			Universities obj = (Universities) table.get(key);
			System.out.println("OBJECT = " + obj.toString());
			System.out.println("NAME = " + obj.getName());
			System.out.println("RANKING = " + obj.getPr());
			System.out.println("PUBLICATIONS = " + obj.getPub());
			System.out.println("LOCATION = " + obj.getLoc());
			
		}
}
