package week3.day2;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;




public class FindIntersectionsUsingSet{
	
	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		for (Integer item1: array1) {
			list1.add(item1);
		}
		 for (Integer item2 : array2) {
			list2.add(item2);
		}
		list1.retainAll(list2);
		
		System.out.println("Intersection through List" + list1);

		Set<Integer> set1 = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		for (Integer data1 : array1) {
			set1.add(data1);
		}
		for (Integer data2 : array2) {
			set2.add(data2);
		}
		
		set1.retainAll(set2);
		System.out.println("Intersection through Set" + set1);
		
	}
	
	
}
