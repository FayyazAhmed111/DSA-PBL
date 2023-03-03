package Assignment;


import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	
	public static ArrayList<Universities> unis = new ArrayList<>(); // list containing object of universities
	public static Hashtable<String,Universities> table = new Hashtable<>(); // Hash table containing keys and objects
	public static MyStack<String> pubstack = new MyStack<String>(); //Stack with sorted publications
	public static MyStack<String> rankstack = new MyStack<String>(); //Stack with sorted rank
	
	
	
	//DSA PBL PROJECT BY 21SW111
	// START OF MAIN METHOD
	
	public static void main(String[] args) {
		
			Steps obj = new Steps();
			obj.step1(unis);				//STEP 1 : MAKE OBJECTS OF UNIVERSITIES
			obj.step2(unis, table);			//STEP 2 : MAKE 4 WORD KEY AND SAVE THEM IN HASHTABLE
			obj.step3(table, pubstack);		//STEP 3: SORT THEM ACCORDING TO PUBLICATION AND SAVE THEM IN STACK (4-WORD KEY)
			obj.step4(table, rankstack);	//STEP 4: SORT THEM ACCORDING TO PAKISTAN RANK AND SAVE THEM IN STACK (4-WORD KEY)
			
		    Problem1 pb1 = new Problem1();
		    Problem2 pb2 = new Problem2();
		    pb2.btm5(pubstack, table);
			
			
	}//end of main method

}//end of Main class
