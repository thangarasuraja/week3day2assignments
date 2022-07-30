package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class CollectionMostDuplicate {

	public static void main(String[] args) {
		//Declare the string 
		String text="abbaba";

		//string convert into character array
		char[] charArray = text.toCharArray();

		//initialize the value
		int value=0;

		//create map 
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		//Iterate the character array and find the first most dublicate key
		for (int i = 0; i < charArray.length; i++) {
			char key=charArray[i];
			if(map.containsKey(key)) {
				value=map.get(key);
				map.put(key, value+1);
				value=map.get(key);
				if(value>=3) {
					System.out.println("First Most duplicate value :"+key);
					break;
				}
			}
			else {
				map.put(key, 1);
			}
		}
	}
}
