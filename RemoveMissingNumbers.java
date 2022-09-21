package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveMissingNumbers {

	public static void main(String[] args) {
		int[] array = {1,2,4,6,8,7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (Integer li : array) {
			list.add(li);
			
		}
		
		Collections.sort(list);
		System.out.println(list);
		for (int i=1; i<list.size(); i++)
		{
			if((i)!= list.get(i-1)){
			System.out.println(i);
		
			}
			
		}
			
	}

}
