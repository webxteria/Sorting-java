package com.bond.test.assignment.sorting;

import com.bond.test.assignment.impl.SortingTechniquesImp;

public class SortingApplication {
	
	public static void main(String[] args) {
		int[] unsortedArray = {2,3,1,5,4};
		int[] sortedArray;
		SortingTechniquesImp sortingTechniques = new SortingTechniques();
		sortedArray = sortingTechniques.bubbleSort(unsortedArray);
		for(int i =0; i<sortedArray.length;i++){
			System.out.print(sortedArray[i]+",");
		}
	}
}
