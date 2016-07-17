package com.bond.test.assignment.sorting;

import com.bond.test.assignment.impl.SortingTechniquesImp;

public class SortingTechniques implements SortingTechniquesImp {
	private long startTime;
	private long endTime;

	/* (non-Javadoc)
	 * @see com.bond.test.assignment.sorting.SortingTechniquesImp#bubbleSort(int[])
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <Any> Any bubbleSort(int[] arrayToSort){
		startTime = System.nanoTime();
		int n = arrayToSort.length;
		int temp = 0;
		for(int i = 0; i<n;i++){
			for(int j=0; j<n-1;j++){
				if(arrayToSort[j]>arrayToSort[j+1]){
					temp = arrayToSort[j+1];
					arrayToSort[j+1] = arrayToSort[j];
					arrayToSort[j] = temp;
				}
			}
		}
		endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Sorting Time : "+ (totalTime)+" nano sec");
		System.out.println("Best Case : O("+n+")");
		System.out.println("Best Case : O("+(n*n)+")");
		return (Any) arrayToSort;
	}
	
	
}
