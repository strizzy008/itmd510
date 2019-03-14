package myTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistTest {

		
	ArrayList<String> mylist = new ArrayList<String>();
	
	int SIZE =3;
	String [] myArray = new String[3];
	
	
		public void addtoList(){
	
			mylist.add("5");
			mylist.add("6");
			mylist.add("2");			
					
			
		}
		
		
		public void sortTheList() {
			
			Collections.sort(mylist);
						
		}
		
		
		public void printTheList() {
			
			System.out.println(mylist);
						
		}
		
		
		public void putTheDataInArray() {
			
			for(int i =0;i<mylist.size()-1;i++) {
				
				myArray[i]=mylist.get(i);
				
			}
			
					
		}
		
		
		
		public  String[] printTheArray() {
			
			return myArray;			
		}
		
		
		
	
	

}
