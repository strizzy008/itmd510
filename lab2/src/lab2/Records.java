/*
  Lab 3 is dedicated towards completing anatlyics to display and output to file a number of quireies.
  Bryan Strawter- ITMD510
 */



package lab2;

import java.text.NumberFormat;
import java.util.Arrays;


// creating a main class which extends Bank Records so I can utilize its classes
public class Records extends BankRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creating an object for this current class which extends Bank Records
		Records r = new Records();
		
		
		// calling the readData function from Bank Records to collect the data in an array list
		r.readData();
		
		// calling the processData function from Bank Records to place the data in an array so we can call upon them in anatlycis
		r.processData();
			
		// displaying the analytics
		System.out.println("\nData Analytics:");
		
		
		// calling location comp to display income per region
		LocationComp();
		
		// calling the MaxMinCalc function to show the highest and lowest income income per region
		MaxMinCalc();
		
		// calling femsComp function to show how many females that have mortgage and savings per region
		femsComp();
		
		// calling maleComp function to show how many males have a car and 1 child per region.
		maleComp();
	}

	
	
	//MaxMinCalc function to show the highest and lowest income income per region
	public static void MaxMinCalc() {
		
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		double ruralMinIncome=0, ruralMaxIncome=0, suburbanMaxIncome=0, suburbanMinIncome=0,
				 innerCityMaxIncome=0, innerCityMinIncome=0, townMaxIncome=0, townMinIncome=0;
		

		for (int i=0;i<robjs2.length;i++) {
			if (robjs2[i].getRegion().equals("RURAL")) { 
				
			
				if(robjs2[i].getIncome()>ruralMaxIncome) {
					ruralMaxIncome=robjs2[i].getIncome();					
				}
				
				if(robjs2[i].getIncome()>ruralMinIncome) {
					ruralMinIncome=robjs2[i].getIncome();					
				}
								
			}
		
			else if(robjs2[i].getRegion().equals("INNER_CITY")) {
				
			
				
				if(robjs2[i].getIncome()>innerCityMaxIncome) {
					innerCityMaxIncome=robjs2[i].getIncome();					
				}
				
				if(robjs2[i].getIncome()>innerCityMinIncome) {
					innerCityMinIncome=robjs2[i].getIncome();					
				}
								
			}
			     
		
			else if(robjs2[i].getRegion().equals("SUBURBAN")) {
				
				
				
				if(robjs2[i].getIncome()>suburbanMaxIncome) {
					suburbanMaxIncome=robjs2[i].getIncome();					
				}
				
				if(robjs2[i].getIncome()>suburbanMinIncome) {
					suburbanMinIncome=robjs2[i].getIncome();					
				}
												
			}
		
			else if(robjs2[i].getRegion().equals("TOWN")) { 
				
			
				
				if(robjs2[i].getIncome()>townMaxIncome) {
					townMaxIncome=robjs2[i].getIncome();					
				}
				
				if(robjs2[i].getIncome()>townMinIncome) {
					townMinIncome=robjs2[i].getIncome();					
				}
			
			}			
						
		
		}
		
		System.out.println("Inner City Region Min Income: " + defaultFormat.format(innerCityMinIncome));
		System.out.println("Rural Region Min Income: " + defaultFormat.format(ruralMinIncome));
		System.out.println("Suburban Region Min Income: " + defaultFormat.format(suburbanMinIncome));
		System.out.println("Town Region Min Income: " + defaultFormat.format(townMinIncome) + "\n");
		
		System.out.println("Inner City Region Max Income: " + defaultFormat.format(innerCityMaxIncome));
		System.out.println("Rural Region Max Income: " + defaultFormat.format(ruralMaxIncome));
		System.out.println("Suburban Region Max Income: " + defaultFormat.format(suburbanMaxIncome));
		System.out.println("Town Region Max Income: " + defaultFormat.format(townMaxIncome)+"\n");
					
	}
	
	
	// avgCalc class to gather the male income and the female income as well as the male count and female count
	public static void avgCalc(){
		
		//establishing variables
		int maleCount = 0, femaleCount = 0;
		double maleIncome = 0, FemaleIncome = 0;
		
		
		//for loop to read thru the array and store data into the variables created in this method
		for(int i=0;i<robjs2.length;++i) {
			
			// if statement for getting the FEMALE Sex
			if(robjs2[i].getSex().equals("FEMALE")) {
				
				//adding each female income to the variable FemaleIncome
				FemaleIncome += robjs2[i].getIncome();
				
				//Increasing the female count
				femaleCount++; }
			
			// if its not female then it will be a male
			else
				
				// increase the male count
				maleCount++;
				// add to the male Income
			    maleIncome += robjs2[i].getIncome();
		}
		
		
	}
	
	// femsComp function to show how many females that have mortgage and savings per region
	public static void femsComp() {
		
		
		// creating the region counts variable
		int ruralFmCt=0, innerCityFmCt=0, suburbanFmCt=0, townFmCt=0; 

		// for loop to go thru the array and an if statement to filter on Each Region and SAVE == YES
		// as well as a filter for sex == FEMALE and mortgage == YES
		for (int i=0;i<robjs2.length;i++) {
			
			// if statement to filter on RURAL and SAVE == YES
			if (robjs2[i].getRegion().equals("RURAL") && robjs2[i].getSave_act().equals("YES")) { 
						
				if(robjs2[i].getSex().equals("FEMALE") && robjs2[i].getMortgage().equals("YES")) {
							
					++ruralFmCt;					
				}
			}
			
			else if (robjs2[i].getRegion().equals("INNER_CITY") && robjs2[i].getSave_act().equals("YES")) { 
					
					if(robjs2[i].getSex().equals("FEMALE") && robjs2[i].getMortgage().equals("YES")) { 
								
						++innerCityFmCt;
					}
		}
			     
		
			else if(robjs2[i].getRegion().equals("SUBURBAN") && robjs2[i].getSave_act().equals("YES")) {
				
				 if(robjs2[i].getSex().equals("FEMALE") && robjs2[i].getMortgage().equals("YES")) {
								
						++suburbanFmCt;					
					}							
			}
		
			else if(robjs2[i].getRegion().equals("TOWN") && robjs2[i].getSave_act().equals("YES")) { 
				
				if(robjs2[i].getSex().equals("FEMALE") && robjs2[i].getMortgage().equals("YES")) {
								
						++townFmCt;					
					}
			
				}			
								
		}
		
		// Printing out the outcome of the analytics 
		System.out.println("Innercity region females with mortgage and savings acct: " + innerCityFmCt);
		System.out.println("Rural regrion females with mortgage and savings acct: " + ruralFmCt);
		System.out.println("Suburban region females with mortgage and savings acct: " + suburbanFmCt);
		System.out.println("Town region females with mortgage and savings acct: " + townFmCt +"\n");
		
	}
	
	// Location Comp function to calculate the average income for each region	
	private static void LocationComp() {
		
		// creating a Number Format object to format money 
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		// sorting the array with the location comparator class
		Arrays.sort(robjs2,new LocationComparator());
		
	    //set up needed vars for region counts & incomes per loc
		double townCt = 0, townIncomeSum=0,
			   innerCityCt = 0, innerCityIncomeSum=0,	
			   suburbanCt=0, suburbanIncomeSum=0,
			   ruralCt=0, ruralIncomeSum=0;
		
		
	
		// for loop to go thru the array and filter on each region 
		// and to seek the income and add it to the regionIncomeSum variable for each region
		// as well as increase the count for each region
		for (int i=0;i<robjs2.length;i++) {
			if (robjs2[i].getRegion().equals("RURAL")) { 
				
				ruralIncomeSum += robjs2[i].getIncome();
				++ruralCt;					
			}
		
			else if(robjs2[i].getRegion().equals("INNER_CITY")) {
				
				innerCityIncomeSum += robjs2[i].getIncome();
				++innerCityCt;
								
			}
			     
		
			else if(robjs2[i].getRegion().equals("SUBURBAN")) {
				
				suburbanIncomeSum += robjs2[i].getIncome();
				++suburbanCt;
							
			}
		
			else if(robjs2[i].getRegion().equals("TOWN")) { 
				
				townIncomeSum += robjs2[i].getIncome();
				++townCt;
	
			}			
			
				
					
		}
		
		
		// performing analytics to gather the average income per region
		double ruralAvg = ruralIncomeSum/(ruralCt);
		double innerCityAvg = innerCityIncomeSum/(innerCityCt);
		double suburbanAvg = suburbanIncomeSum/(suburbanCt);
		double townAvg = townIncomeSum/(townCt);
		
		// printing out data from each region and formating the average variable into currency
		System.out.println("\nInner City Region Income Average: " + defaultFormat.format(innerCityAvg));
		System.out.println("Rural Region Income Average: " + defaultFormat.format(ruralAvg));
		System.out.println("Suburban Region Income Average: " + defaultFormat.format(suburbanAvg));
		System.out.println("Town Region Income Average: " + defaultFormat.format(townAvg) + "\n");
		
	}
	
	
	// maleComp function to show how many males have a car and 1 child per region.
	public static void maleComp() {
		
		// variables for each region and their count
		int ruralMct=0, innerCityMct=0, suburbanMct=0, townMct=0; 
		
		// for loop to go thru each element of the array as well as if statements to filter on each region 
		// and if males have a car and 1 child
		for (int i=0;i<robjs2.length;i++) {
			if (robjs2[i].getRegion().equals("RURAL") && robjs2[i].getCar().equals("YES")) { 
						
				if(robjs2[i].getSex().equals("MALE") && robjs2[i].getChildren() == 1) {
							
					++ruralMct;					
				}
			}
			
			else if (robjs2[i].getRegion().equals("INNER_CITY") && robjs2[i].getCar().equals("YES")) { 
				
					if(robjs2[i].getSex().equals("MALE") && robjs2[i].getChildren() == 1) {
								
						++innerCityMct;
					}
			}
			     
		
			else	if (robjs2[i].getRegion().equals("SUBURBAN") && robjs2[i].getCar().equals("YES")) { 
				
					if(robjs2[i].getSex().equals("MALE") && robjs2[i].getChildren() == 1) {
						
						++suburbanMct;
				}
		
					
			}
					
			
			else if(robjs2[i].getRegion().equals("TOWN") && robjs2[i].getCar().equals("YES")) { 
				
				if(robjs2[i].getSex().equals("MALE") && robjs2[i].getChildren() == 1) {
								
						++townMct;					
					}
			
				}		
			
		}
		
		// printing out outcome of analytics for each region
		System.out.println("Innercity region males with car and 1 child: " + innerCityMct);
		System.out.println("Rural regrion males with car and 1 child: " + ruralMct);
		System.out.println("Suburban region males with car and 1 child: " + suburbanMct);
		System.out.println("Town region males with car and 1 child: " + townMct +"\n");
		
		
	}
	
	
	
}



