package week3.day2.assignments;


import java.util.LinkedHashSet;

import java.util.Set;

public class CollectionsRemoveDuplicates {

	public static void main(String[] args) {
		
		//Goint to Remove the dublicates from the below string 
		String text = "We learn java basics as part of java sessions in java week1";

		//Split the string and create a string array
		String[]str=text.split(" ");
		
		//create an set 
		Set<String> dublicate=new LinkedHashSet<String>();
        
		//Iterate the string array and add the word in set
		
		for (int i = 0; i < str.length; i++) {
			dublicate.add(str[i]);
            }
		
		//print the value 
		System.out.println(dublicate);
		}
}
