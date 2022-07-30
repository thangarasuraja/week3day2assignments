package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;



public class CollectionMissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		//Create the list
		List<Integer> list=new ArrayList<Integer>();
		
		//initialize the value
		int value=1;
		
		//iterate the array and add the values in list
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		//sort the list
		Collections.sort(list);
		
		//print the list
		System.out.println("list :"+list);
		
		//print the size of the list
		int size=list.size();
		System.out.println("Size of the list is :"+size);
		
		//Iterate the list and found the missing element
		for (int j = 0; j <= size-1; j++) {
			
			int a=list.get(j);
			if(value!=a) {
				System.out.println("Missing Element is :" +value);
				value=value+2;
			}
			else {
			value=value+1;
			}
		}
		
		

			}
}
			
		


