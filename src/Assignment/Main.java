package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static ArrayList<Universities> unis = new ArrayList<>(); // list containing object of universities
	public static Hashtable<String,Object> table = new Hashtable<>(); // Hash table containing keys and objects
	public static MyStack<String> stack = new MyStack<String>(); //Stack with sorted publications
	public static MyStack<String> stack1 = new MyStack<String>(); //Stack with sorted rank
	
		
	public static void prob1() {
	
		//GETTING KEY FROM USER
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 4 letter keyword: ");
			String key = scan.nextLine();
			//TO CHECK KEY IS 4 LETTER
			if (key.length()!=4) {
				while(key.length()!=4) {
					System.out.println("Key should be 4 letter");	
					System.out.println("Enter Key Again: ");
					key = scan.nextLine();
				}
			}
			//GIVING DETAILS FOR KEYS
			while(!table.containsKey(key)) {
				System.out.println("KEY doesn't exsist, Enter key Again: ");
				key = scan.nextLine();
				if(key.length()!=4) {
					System.out.println("Key should be 4 letter");	
					System.out.println("Enter Key Again: ");
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
	
		public static void main(String[] args) {
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
		    
		        //**********STEP 2**********
		        //MAKING KEYS FOR HASHTABLE
		        table.put("ABYU", unis.get(0));  // Abasyn University
		        table.put("AWKU", unis.get(1));  // Abdul Wali Khan University Mardan
		        table.put("AGKU", unis.get(2));  // Aga Khan University
		        table.put("AUNI", unis.get(3));  // Air University
		        table.put("BKUI", unis.get(4));  // Bacha Khan University
		        table.put("BZUI", unis.get(5));  // Bahauddin Zakariya University
		        table.put("BUNI", unis.get(6));  // Bahria University
		        table.put("BUIT", unis.get(7));  // Balochistan University of Information Technology Engineering and Management Sciences
		        table.put("BMUN", unis.get(8));  // Baqai Medical University
		        table.put("BNUN", unis.get(9));  // Beaconhouse National University
		        table.put("CECO", unis.get(10)); // CECOS University
		        table.put("COMS", unis.get(11)); // COMSATS Institute of Information Technology
		        table.put("DUET", unis.get(12)); // Dawood University of Engineering and Technology
		        table.put("DUHS", unis.get(13)); // DOW University of Health Sciences
		        table.put("FJMU", unis.get(14)); // Fatima Jinnah Medical University
		        table.put("FJWU", unis.get(15)); // Fatima Jinnah Women University
		        table.put("FUUT", unis.get(16)); // Federal Urdu University of Arts Sciences and Technology
		        table.put("FCCU", unis.get(17)); // Forman Christian College
		        table.put("FUIN", unis.get(18)); // Foundation University Islamabad
		        table.put("GIKI", unis.get(19)); // Ghulam Ishaq Khan Institute of Engineering Sciences and Technology
		        table.put("GOMU", unis.get(20)); // Gomal University
		        table.put("GCWS", unis.get(21)); // Government College for Women University Sialkot
		        table.put("GCUF", unis.get(22)); // Government College University Faisalabad
		        table.put("GCUL", unis.get(23)); // Government College University Lahore
		        table.put("GCWU", unis.get(24)); // Government College Women University Faisalabad
		        table.put("HAMU", unis.get(25)); // Hamdard University
		        table.put("HAZU", unis.get(26)); // Hazara University
		        table.put("HITE", unis.get(27)); // HITEC University
		        table.put("INDU", unis.get(28)); // Indus University Pakistan
		        table.put("ITUN", unis.get(29)); // Information Technology University
		        table.put("IBAU", unis.get(30)); // Institute of Business Administration
		        table.put("ISTU", unis.get(31)); // Institute of Space Technology
		        table.put("IIUI", unis.get(32)); // International Islamic University Islamabad
		        table.put("IUNI", unis.get(33)); // Iqra University
		        table.put("ICPU", unis.get(34)); // Islamia College Peshawar
		        table.put("IUBU", unis.get(35)); // Islamia University of Bahawalpur
		        table.put("ISRA", unis.get(36)); // Isra University
		        table.put("JSMU", unis.get(37)); // Jinnah Sindh Medical University
		        table.put("JUWO", unis.get(38)); // Jinnah University for Women
		        table.put("KIET", unis.get(39)); // Karachi Institute of Economics and Technology
		        table.put("KIUN", unis.get(40)); // Karakurum International University
		        table.put("KMUN", unis.get(41)); // Khyber Medical University
		        table.put("KEMU", unis.get(42)); // King Edward Medical University
		        table.put("KCWC", unis.get(43)); // Kinnaird College for Women
		        table.put("KUST", unis.get(44)); // Kohat University of Science and Technology
		        table.put("LCWU", unis.get(45)); // Lahore College for Women University
		        table.put("LSEU", unis.get(46)); // Lahore School of Economics
		        table.put("LUMS", unis.get(47)); // Lahore University of Management Sciences
		        table.put("LUHS", unis.get(48)); // Liaquat University of Medical and Health Sciences
		        table.put("MUET", unis.get(49)); // Mehran University of Engineering and Technology
		        table.put("MUST", unis.get(50)); // Mirpur University of Science and Technology
		        table.put("MAJU", unis.get(51)); // Mohammad Ali Jinnah University
		        table.put("NCBA", unis.get(52)); // National College of Business Administration and Economics
		        table.put("NDUN", unis.get(53)); // National Defence University
		        table.put("NTUN", unis.get(54)); // National Textile University
		        table.put("NUCE", unis.get(55)); // National University of Computer and Emerging Sciences
		        table.put("NUML", unis.get(56)); // National University of Modern Languages
		        table.put("NUST", unis.get(57)); // National University of Sciences and Technology
		        table.put("NEDU", unis.get(58)); // NED University of Engineering and Technology
		        table.put("PIDE", unis.get(59)); // Pakistan Institute of Development Economics
		        table.put("PIEA", unis.get(60)); // Pakistan Institute of Engineering and Applied Sciences
		        table.put("UAAR", unis.get(61)); // Pir Mehr Ali Shah Arid Agriculture University
		        table.put("PRES", unis.get(62)); // Preston University
		        table.put("QUES", unis.get(63)); // Quaid-e-Awam University of Engineering Science and Technology
		        table.put("QAUN", unis.get(64)); // Quaid-i-Azam University
		        table.put("RMUN", unis.get(65)); // Rawalpindi Medical University
		        table.put("Riph", unis.get(66)); // Riphah International University
		        table.put("SUIT", unis.get(67)); // Sarhad University of Science and Information Technology
		        table.put("SALU", unis.get(68)); // Shah Abdul Latif University
		        table.put("SBBW", unis.get(69)); // Shaheed Benazir Bhutto Women University
		        table.put("SZAB", unis.get(70)); // Shaheed Zulfiqar Ali Bhutto Institute of Science and Technology
		        table.put("SAUN", unis.get(71)); // Sindh Agriculture University
		        table.put("SMIU", unis.get(72)); // Sindh Madresatul Islam University
		        table.put("SUET", unis.get(73)); // Sir Syed University of Engineering and Technology
		        table.put("IBAS", unis.get(74)); // Sukkur Institute of Business Administration
		        table.put("UOAF", unis.get(75)); // University of Agriculture Faisalabad
		        table.put("UOAP", unis.get(76)); // University of Agriculture Peshawar
		        table.put("UAJK", unis.get(77)); // University of Azad Jammu and Kashmir
		        table.put("UNOB", unis.get(78)); // University of Balochistan
		        table.put("UNCP", unis.get(79)); // University of Central Punjab
		        table.put("UNED", unis.get(80)); // University of Education - Pakistan
		        table.put("UETL", unis.get(81)); // University of Engineering and Technology Lahore
		        table.put("UETP", unis.get(82)); // University of Engineering and Technology Peshawar
		        table.put("UETT", unis.get(83)); // University of Engineering and Technology Taxila
		        table.put("UOGT", unis.get(84)); // University of Gujrat
		        table.put("UNOH", unis.get(85)); // University of Haripur
		        table.put("UHSL", unis.get(86)); // University of Health Sciences Lahore
		        table.put("UNOK", unis.get(87)); // University of Karachi
		        table.put("UNOL", unis.get(88)); // University of Lahore
		        table.put("UNOM", unis.get(89)); // University of Malakand
		        table.put("UMTL", unis.get(90)); // University of Management and Technology - Lahore
		        table.put("UNOP", unis.get(91)); // University of Peshawar
		        table.put("UNOS", unis.get(92)); // University of Sargodha
		        table.put("USTB", unis.get(93)); // University of Science and Technology Bannu
		        table.put("UOSD", unis.get(94)); // University of Sind
		        table.put("UOSW", unis.get(95)); // University of Swat
		        table.put("UOPU", unis.get(96)); // University of the Punjab
		        table.put("UVAS", unis.get(97)); // University of Veterinary and Animal Sciences
		        table.put("UNOW", unis.get(98)); // University of Wah
		        table.put("ZUNI", unis.get(99)); // Ziauddin University
		        
		        // **************STEP 3*************
				Object arr[][] = new Object[table.size()][2];
				
				//TO FETCH OBJECTS FROM HASHTABLE INTO ARRAY
				int k=0;	
				for(Entry<String, Object> e: table.entrySet()){
						arr[k][0]=e.getKey();
						arr[k][1]=e.getValue();
						k++;
							}
				for(int i=0;i<100;i++) {
					Universities obj = (Universities) arr[i][1];
					arr[i][1]=obj.getPub();
				}
				
				//SORTING 
				Arrays.sort(arr, Comparator.comparingInt(a -> (int)a[1]));
				
				//SAVING INTO STACK
				for(int i=arr.length-1;i>=0;i--) {
					stack.push((String) arr[i][0]);
				}
				
				//**********STEP 4***********
				
				//TO FETCH OBJECTS FROM HASHTABLE INTO ARRAY
				
				k=0;	
				for(Entry<String, Object> e: table.entrySet()){
						arr[k][0]=e.getKey();
						arr[k][1]=e.getValue();
						k++;
							}
				//TO GET PAKISTAN RANKING
				for(int i=0;i<100;i++) {
					
					Universities obj = (Universities) arr[i][1];
					
					//TO REMOVE '/' FROM THE RANKING FORMAT IN CSV FILE & PARSING FROM STRING TO INTEGER
					arr[i][1]=Integer.parseInt(obj.getPr().substring(0, obj.getPr().length()-6));
				}
				
				//SORTING 
				Arrays.sort(arr, Comparator.comparingInt(a -> (int)a[1]));
				
				//SAVING INTO STACK
				for(int i=arr.length-1;i>=0;i--) {
					stack1.push((String) arr[i][0]);
				}
				
				
				//*********************PROBLEMS*********************
				//STILL WORKING ON PROBLEMS 
				
				//PROBLEM # 1
				prob1();
				
				
		}//end of main function
		
}//end of Main class
