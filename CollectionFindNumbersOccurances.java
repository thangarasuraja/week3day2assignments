package week3.day2.assignments;


import java.util.Map;
import java.util.TreeMap;

public class CollectionFindNumbersOccurances {

	public static void main(String[] args) {
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
	    
		//Declare the array list
		int[] arrayList= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//create the map object
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
		
		//Iterate the arraylist and found the number of occurance
		for (int i = 0; i < arrayList.length; i++) {
			
			int key=arrayList[i];
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}
				
			else {
			map.put(key, 1);
			}
		

	}
		//print map entries
		System.out.println(map);
	}
}
