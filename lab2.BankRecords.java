package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;


public class BankRecords extends Client {
	
	//creating the array list called blist
	static ArrayList<List<String>> blist = new ArrayList<>();
	
	//creating the array called robjs2
	static BankRecords robjs2[] = new BankRecords[600];
	
	//creating a buffer reader object called br
	static BufferedReader br;
	
	//creating a scanner object called sc
	Scanner sc = new Scanner(System.in);
	
	//creating variables
	private String id;
	private int age;
	private String sex;
	private String region;
	private double income;
	private String married;
	private int children;
	private String car;
	private String save_act;
	private String current_act;
	private String mortgage;
	private String pep;
	
	// creating the read data method to read in the csv file in a try catch fashion where if it does not find the file then it throws an exception
	// It then opens the file for a readLine operation and then it closes the file once completed
	@Override
	public void readData() {
		
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		
		try {
			System.out.println("CSV import started at " + timeStamp);
			br = new BufferedReader (new FileReader(new File("bank-Detail.csv")));
			
			//creating a variable of string type called line
			String line;
			
			// a while loop where it reads till the end of the csv and is storing it in the array list split by a delimiter of a comma
			while ((line = br.readLine()) !=null) {
				blist.add(Arrays.asList(line.split(",")));
			}br.close();
			
		}catch (Exception e) {
			System.out.println("There was a problem loading the file");
		}
		
		System.out.println("CSV import file completed at " + timeStamp);
		
		
	}
	

	//creating the processData method to put the elements of the array list into the array robjs2
	@Override
	public void processData() {
		// TODO Auto-generated method stub
		
		//creating the idx variable as an index and starting it at 0
		int idx=0;
	    
		//create loop to grab each array index containing a list of values
	    //and PASS that data into your record objects' setters 
  
	    for (List<String> rowData: blist){
	        	
	    	//initialize array of objects
	    	robjs2[idx] = new BankRecords();
	    	//call setters below 
	    	
	    	robjs2[idx].setId(rowData.get(0)); //get first column value   	
	    	robjs2[idx].setAge(Integer.parseInt(rowData.get(1))); // get second column	    	
	    	robjs2[idx].setSex(rowData.get(2)); // get third column
	    	robjs2[idx].setRegion(rowData.get(3)); // get fourth column
	    	robjs2[idx].setIncome(Double.parseDouble(rowData.get(4))); // get fifth column
	    	robjs2[idx].setMarried(rowData.get(5)); // get sixth column
	    	robjs2[idx].setChildren(Integer.parseInt(rowData.get(6))); // get seventh column
	    	robjs2[idx].setCar(rowData.get(7)); // get eighth column
	    	robjs2[idx].setSave_act(rowData.get(8)); // get ninth column
	    	robjs2[idx].setCurrent_act(rowData.get(9)); // get tenth column
	    	robjs2[idx].setMortgage(rowData.get(10)); // get eleventh column
	    	robjs2[idx].setPep(rowData.get(11)); // get twelfth column
	    	idx++;
	    }
	    
	}
	
	// creating the print data method to display the amount of records as inputted by the user
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		
		//variable displayNum to hold the user input
		int displayNum;
		
		// prompting the user to input the amount of records he/she would like to view
		System.out.println("Greetings, How many records would you like to view?");
		displayNum = sc.nextInt();
		
		//error handling of the user input to make sure the number is a positive number
		while (displayNum < 0 ) {
			 System.out.println("You have entered a negative number. You must enter a positive Number.");
			 displayNum = sc.nextInt();
			}
		//error handling of the user input to make sure the number is below 600
		while (displayNum > 600 ) {
			 System.out.println("You need to enter a number less than 600.");
			 displayNum = sc.nextInt();
			}
		
		
		// printing out the header information
		System.out.printf("%nid\t\tAge\t\tSex\t\tRegion\t\t           Income\t\t       Mortgage%n%n");
		
		// for loop to print out the requested information in a formatted fashion
		for (int i=0;i<displayNum;i++){
				
			 	
		    	String s=String.format("%s\t\t%s\t\t%s\t\t%10s\t\t%10s\t\t%10s\t\t", robjs2[i].getId(),
		    			robjs2[i].getAge(),robjs2[i].getSex(),robjs2[i].getRegion(),robjs2[i].getIncome(),robjs2[i].getMortgage());
		    		
		    	System.out.println(s);}
		
	}

	
	//Getters and Setters of the defined instances
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public double getIncome() {
		return income;
	}


	public void setIncome(double income) {
		this.income = income;
	}


	public String getMarried() {
		return married;
	}


	public void setMarried(String married) {
		this.married = married;
	}


	public int getChildren() {
		return children;
	}


	public void setChildren(int children) {
		this.children = children;
	}


	public String getCar() {
		return car;
	}


	public void setCar(String car) {
		this.car = car;
	}


	public String getSave_act() {
		return save_act;
	}


	public void setSave_act(String save_act) {
		this.save_act = save_act;
	}


	public String getCurrent_act() {
		return current_act;
	}

	
	public void setCurrent_act(String current_act) {
		this.current_act = current_act;
	}

	
	public String getMortgage() {
		return mortgage;
	}


	public void setMortgage(String morgtage) {
		this.mortgage = morgtage;
	}


	public String getPep() {
		return pep;
	}

	
	public void setPep(String pep) {
		this.pep = pep;
	}

	
}





