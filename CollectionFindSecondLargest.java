package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		//create List
		List<Integer> list=new ArrayList<Integer>();
		
		//Iterate the array and add in list
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		
		//print the list
		System.out.println(list);
		
		//sort the list
		Collections.sort(list);
		
		//Print the sorted list
		System.out.println(list);
		
		//print the second largest number from list
		
		int secondLargestNumber=list.get(1);
		System.out.println("Second largest number is :" + secondLargestNumber);

	}

}
