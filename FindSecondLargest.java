package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		for (Integer eachItem : data) {
			list.add(eachItem);
			
			
			
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size()-2));

	}

}
