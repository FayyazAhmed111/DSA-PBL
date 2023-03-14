package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map.Entry;

public class Steps {
	
	String keys[] = {
			"ABYU","AWKU","AGKU","AUNI","BKUI","BZUI","BUNI","BUIT","BMUN","BNUN","CECO","COMS","DUET","DUHS","FJMU","FJWU","FUUT","FCCU","FUIN",
			"GIKI","GOMU","GCWS","GCUF","GCUL","GCWU","HAMU","HAZU","HITE","INDU","ITUN","IBAU","ISTU","IIUI","IUNI","ICPU","IUBU","ISRA","JSMU",
			"JUWO","KIET","KIUN","KMUN","KEMU","KCWC","KUST","LCWU","LSEU","LUMS","LUHS","MUET","MUST","MAJU","MCBA","NDUN","NTUN","NUCE","NUML",
			"NUST","NEDU","PIDE","PIEA","UAAR","PRES","QUES","QAUN","RMUN","RIPH","SUIT","SALU","SBBW","SZAB","SAUN","SMIU","SUET","IBAS","UOAF",
			"UOAP","UAJK","UNOB","UNCP","UNED","UETL","UETP","UETT","UOGT","UNOH","UHSL","UNOK","UNOL","UNOM","UMTL","UNOP","UNOS","USTB","UOST",
			"UOSW","UOPU","UVAS","UNOW","ZUNI"};

	//STEPS
		public void step1(ArrayList<Universities> unis) {
			//********STEP 1********
			// READING CSV FILE AND MAKING OBJECTS
			try {
					File file = new File("src//pak unis.csv");
					Scanner scanner = new Scanner(file);
					scanner.nextLine();
 
					while (scanner.hasNextLine()) {
	            	     	 String line = scanner.nextLine();
	            	     	 String[] parts = line.split(",");
	            	         String name = parts[0];
	            	         String wr = parts[1];
	            	         String ar = parts[2];
	                         String pr = parts[3];
	                         String loc = parts[4];
	                         int pub = Integer.parseInt(parts[5]);
	                          
	                         unis.add(new Universities(name, wr, ar, pr, loc, pub));
	                         	        	
	      								} //end of while loop
	    			} //end of tryblock
	    				catch (FileNotFoundException e) {
	    					System.out.println("File not found: " + e.getMessage());
	    					return;
	    						}//end of catchblock

	}//STEP 1 Ends
		
			public void step2 (ArrayList<Universities> unis,Hashtable<String,Universities> table) {

	            //**********STEP 2**********
	            //MAKING KEYS FOR HASHTABLE
				for(int i=0;i<keys.length;i++) {
					table.put(keys[i], unis.get(i));
				}
	            	            

	} // STEP 2 ENDS
		
			public void step3(Hashtable<String,Universities> table,MyStack<String> stack) {
		
		        // **************STEP 3*************
				Object arr[][] = new Object[table.size()][2];
				
				//TO FETCH OBJECTS FROM HASHTABLE INTO ARRAY
				int k=0;	
				for(Entry<String, Universities> e: table.entrySet()){
						arr[k][0]=e.getKey();
						arr[k][1]=e.getValue();
						k++;
							} // entryset loop end
				
				for(int i=0;i<arr.length;i++) {
					Universities obj = (Universities) arr[i][1];
					arr[i][1]=obj.getPub();
				} // for loop end
				
				//SORTING 
				Arrays.sort(arr, Comparator.comparingInt(a -> (int)a[1]));
				
				//SAVING INTO STACK
				for(int i=arr.length-1;i>=0;i--) {
					stack.push((String) arr[i][0]);
				}// loop end	
				
			}// Step 3 END 
			
			 public void step4(Hashtable<String,Universities> table,MyStack<String> stack1) {
				//**********STEP 4***********
				
				//TO FETCH OBJECTS FROM HASHTABLE INTO ARRAY
				Object arr[][] = new Object[table.size()][2];
				int k=0;	
				for(Entry<String, Universities> e: table.entrySet()){
						arr[k][0]=e.getKey();
						arr[k][1]=e.getValue();
						k++;
							}
				//TO GET PAKISTAN RANKING
				for(int i=0;i<arr.length;i++) {
					
					Universities obj = (Universities) arr[i][1];
					
					//TO REMOVE '/' FROM THE RANKING FORMAT IN CSV FILE & PARSING FROM STRING TO INTEGER
					arr[i][1]=Integer.parseInt(obj.getPr().substring(0, obj.getPr().length()-6));
				}
				
				//SORTING 
				Arrays.sort(arr, Comparator.comparingInt(a -> (int)a[1]));
				
				//SAVING INTO STACK
				for(int i=0;i<arr.length;i++) {
					stack1.push((String) arr[i][0]);
				}
				
			}
			// Step 4 ends
		

}// CLASS END