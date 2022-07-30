package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class CollectionPrintDuplicatesInArray {

	public static void main(String[] args) {
		
		//initialize arraylist
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		//create set object
		Set<Integer> set=new HashSet<Integer>();
		
		
		//Iterate the arraylist , add the elements in set list and print the dublicate
		for (int i = 0; i < arr.length; i++) {
			boolean a=set.add(arr[i]);
			if(!a){
				System.out.println(arr[i]);
			}
			
		}

	}

}
