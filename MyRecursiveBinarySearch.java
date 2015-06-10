package com.github.ashikuzzaman.javaapichecks.collections;

/** 
A binary search or half-interval search algorithm finds the position of a specified value (the input "key") within a sorted array. In each step, the algorithm compares the input key value with the key value of the middle element of the array. If the keys match, then a matching element has been found so its index, or position, is returned. Otherwise, if the sought key is less than the middle element's key, then the algorithm repeats its action on the sub-array to the left of the middle element or, if the input key is greater, on the sub-array to the right. If the remaining array to be searched is reduced to zero, then the key cannot be found in the array and a special "Not found" indication is returned.

Every iteration eliminates half of the remaining possibilities. This makes binary searches very efficient - even for large collections.

Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).

Worst case performance: O(log n)

Best case performance: O(1)

Recursion is used in this algorithm because with each pass a new array is created by cutting the old one in half. The binary search procedure is then called recursively, this time on the new array. Typically the array's size is adjusted by manipulating a beginning and ending index. The algorithm exhibits a logarithmic order of growth because it essentially divides the problem domain in half with each pass.

@author ashik
 
to compile: javac -d . MyRecursiveBinarySearch.java
to run: java com.github.ashikuzzaman.javaapichecks.collections.MyRecursiveBinarySearch
*/
public class MyRecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) {
		System.out.println("< mid = " + mid + ", start = " + start + " and end = " + end);
                return recursiveBinarySearch(sortedArray, start, mid, key);                 
            } else if (key > sortedArray[mid]) {
		System.out.println("> mid = " + mid + ", start = " + start + " and end = " + end);
                return recursiveBinarySearch(sortedArray, mid+1, end , key);                 
            } else {
                return mid;  
            }
        }
        return -(start + 1); 
    }
 
    public static void main(String[] args) {
         
        int[] arr1 = {2, 3, 7, 9, 11, 17, 19, 23, 45, 234, 567, 876, 900, 976, 999, 1020, 2040, 3333, 4444, 5555, 6666, 7777, 8888, 9999, 10000, 20000};
        int index = recursiveBinarySearch(arr1,0,arr1.length,45);
        System.out.println("Found 45 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
    }
}

