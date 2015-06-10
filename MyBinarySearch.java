package com.github.ashikuzzaman.javaapichecks.collections;

import java.util.Arrays;

/** 
A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array. In each step, the algorithm compares the input key value with the key value of the middle element of the array. If the keys match, then a matching element has been found so its index, or position, is returned. Otherwise, if the sought key is less than the middle element's key, then the algorithm repeats its action on the sub-array to the left of the middle element or, if the input key is greater, on the sub-array to the right. If the remaining array to be searched is reduced to zero, then the key cannot be found in the array and a special "Not found" indication is returned.

Every iteration eliminates half of the remaining possibilities. This makes binary searches very efficient - even for large collections.

Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).

Worst case performance: O(log n)

Best case performance: O(1)

@author ashik
 
to compile: javac -d . MyBinarySearch.java
to run: java com.github.ashikuzzaman.javaapichecks.collections.MyBinarySearch
*/
public class MyBinarySearch {
 
    public int binarySearch(int[] inputArr, int key) {        
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
	    System.out.println("mid index  = " + mid);
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
	System.out.println("Key " + key + " could not be found.");
        return -1;
    }
  
    public static void main(String[] args) {
        MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 34, 112, 456, 567, 677, 888, 999}; // already sorted
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        System.out.println("Key 2000's position: "+mbs.binarySearch(arr, 2000));
	// int[] arr1 = {6,34,78,123,432,900, 1011, 1375};
        int[] arr1 = {78, 6, 34, 1375, 78, 1011, 123, 900, 432, 1011}; // unsorted
	Arrays.sort(arr1);
        System.out.println("After sorting: ");
	for(int x : arr1) {
        	System.out.print(x + " ");
	}
        System.out.println("\nKey 432's position: "+mbs.binarySearch(arr1, 432));
    }
}

