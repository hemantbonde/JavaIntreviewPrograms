package Array_program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PracScenario {

	public static void main(String[] args) {
		// remove Duplicate in array  and make it in acsending order
		int arr[]= {20,50,40,30,10,50,40,50};
		Set<int[]> set = new HashSet<>(Arrays.asList(arr));
		System.out.println(set);
				int arr[] = { 20, 50, 40, 30, 10, 50, 40, 50 };

		System.out.println(Arrays.toString(arr));
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}
		Integer[] arrInt=set.toArray(new Integer[0]);
		Arrays.sort(arrInt);
		int[] newArr=new int[arrInt.length];
		for (int i=0; i<arrInt.length; i++) {
			newArr[i]=arrInt[i];
		}
		System.out.println(Arrays.toString(newArr));

		
		

	}

}
