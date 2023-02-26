package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	
	public static ArrayList<Universities> unis = new ArrayList<>(); // list containing object of universities
	public static Hashtable<String,Universities> table = new Hashtable<>(); // Hash table containing keys and objects
	public static MyStack<String> stack = new MyStack<String>(); //Stack with sorted publications
	public static MyStack<String> stack1 = new MyStack<String>(); //Stack with sorted rank
	
	
	
	//DSA PBL PROJECT BY 21SW111
	// START OF MAIN METHOD
	
	public static void main(String[] args) {
		
			Steps obj = new Steps();
			obj.step1(unis);
			obj.step2(unis, table);
			obj.step3(table, stack);
			obj.step4(table, stack1);
			
		    Problem1 pb1 = new Problem1();
		    Problem2 pb2 = new Problem2();
			//pb1.searchwithoutcol(table);
			/*pb2.top5(stack, table);
			System.out.println();
			pb2.top5(stack1, table);
			System.out.println();*/			
			pb2.fiftypercentile(stack, table);
			pb2.fiftypercentile(stack1, table);
			
			
			
			
	}//end of main method

}//end of Main class
