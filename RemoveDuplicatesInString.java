package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String text = "We learn java basics as a part of java sessions in java week1";
		String[] split = text.split(" ");

		Set<String> values = new LinkedHashSet<String>();
		for (String str : split) {
			values.add(str);
			
		}
		System.out.println(values);
	}
	
	

	
			

}