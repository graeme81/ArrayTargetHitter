package twoNumTarget;

import java.util.Arrays;

public class Finder {

	public Finder() {}
	
	public boolean search(int[] numbers, int target) {
		
		Arrays.parallelSort(numbers);
		
		for(int i = 0; i< numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++){
				if(numbers[i] + numbers[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

}
