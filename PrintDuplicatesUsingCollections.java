package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.IFactoryAnnotation;

public class PrintDuplicatesUsingCollections {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> list = new LinkedList<Integer>();
		
		for (Integer listItem: array) {
			list.add(listItem);
		}
		Collections.sort(list);
		System.out.println(list);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1) == list.get(i)) {
			System.out.println(list.get(i));
			}
		
	}

}

}