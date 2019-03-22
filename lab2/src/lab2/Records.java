package lab2;

import java.text.NumberFormat;
import java.util.Arrays;

public class Records extends BankRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Records r = new Records();
		//LocationComparator lc = new LocationComparator();
		
		r.readData();
		r.processData();
		//avgCalc();
		LocationComp();
		MaxMinCalc();
		femsComp();
		
		
		
		
		
		//lc.compare(r.getRegion(),r.getRegion());
		// call the functions to do analytics
		
		//create avg(); obtain stats by location , by human, by income, by gender
			
	}

	
	
	
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
	
	public static void avgCalc(){
			
		int maleCount = 0, femaleCount = 0;
		double maleIncome = 0, FemaleIncome = 0;
		
				
		for(int i=0;i<robjs2.length;++i) {
			
			if(robjs2[i].getSex().equals("FEMALE")) {
				
				FemaleIncome += robjs2[i].getIncome();
				
				femaleCount++; }
			
			else
				
				maleCount++;
			    maleIncome += robjs2[i].getIncome();
		}
		
		
		
		System.out.println("Female Count = " + femaleCount + "Male Count = " + maleCount);
					
	}
	
	public static void femsComp() {
		
		int ruralFmCt=0, innerCityFmCt=0, suburbanFmCt=0, townFmCt=0; 

		for (int i=0;i<robjs2.length;i++) {
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
								
		System.out.println("Innercity region females with mortgage and savings acct: " + innerCityFmCt);
		System.out.println("Rural regrion females with mortgage and savings acct: " + ruralFmCt);
		System.out.println("Suburban region females with mortgage and savings acct: " + suburbanFmCt);
		System.out.println("town region females with mortgage and savings acct: " + townFmCt);
		
	}
	
			
	private static void LocationComp() {
		
		
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		Arrays.sort(robjs2,new LocationComparator());
		
	            //set up needed vars for region counts & incomes per loc
		double townCt = 0, townIncomeSum=0,
			   innerCityCt = 0, innerCityIncomeSum=0,	
			   suburbanCt=0, suburbanIncomeSum=0,
			   ruralCt=0, ruralIncomeSum=0;
		
		
	
		
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
		
		double ruralAvg = ruralIncomeSum/(ruralCt);
		double innerCityAvg = innerCityIncomeSum/(innerCityCt);
		double suburbanAvg = suburbanIncomeSum/(suburbanCt);
		double townAvg = townIncomeSum/(townCt);
		
		System.out.println("\nInner City Region Income Average: " + defaultFormat.format(innerCityAvg));
		System.out.println("Rural Region Income Average: " + defaultFormat.format(ruralAvg));
		System.out.println("Suburban Region Income Average: " + defaultFormat.format(suburbanAvg));
		System.out.println("Town Region Income Average: " + defaultFormat.format(townAvg) + "\n");
		
	}
	
	
}
