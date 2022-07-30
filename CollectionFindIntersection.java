package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFindIntersection {

	public static void main(String[] args) {
		//Create an interger arrays
		
		int[] arrayList1= {3,2,11,4,6,7};
		
		int[] arrayList2= {1,2,8,4,9,7};
		
		
		//create the lists
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		
		
		//add arraylist1 to list1
		for (int i = 0; i < arrayList1.length; i++) {
			
		list1.add(arrayList1[i]);
			}
		
		//add arraylist2 to list2
		for (int j = 0; j < arrayList2.length; j++) {
			
			list2.add(arrayList2[j]);
			
		}
		
		
		//FindIntersection here 
		list1.retainAll(list2);
		
		
		//print the intersection values
		System.out.println(list1);

	
		}
	}


