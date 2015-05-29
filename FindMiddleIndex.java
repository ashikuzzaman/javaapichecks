package com.java2novice.algos;

/** 
You are given an array of numbers. 
Find out the array index or position where sum of numbers preceeding the index 
is equals to sum of numbers succeeding the index. 

@author ashik
 
to compile: javac -d . FindMiddleIndex.java
to run: java com.java2novice.algos.FindMiddleIndex

*/

public class FindMiddleIndex { 

    public static int findMiddleIndex(int[] numbers) throws Exception { 
        int endIndex = numbers.length - 1; 
        int startIndex = 0; 
        int sumLeft = 0; 
        int sumRight = 0; 
        while (true) { 
            if (sumLeft > sumRight) { 
                sumRight += numbers[endIndex--]; 
            } else { 
                sumLeft += numbers[startIndex++]; 
            } 
            if (startIndex > endIndex) { 
                if (sumLeft == sumRight) { 
                    break; 
                } else { 
                    throw new Exception( "Please pass proper array to match the requirement"); 
                } 
            } 
        } return endIndex; 
    } 

    public static void main(String a[]) { 
        int[] num = { 1, 7, 3, 2, 4, 4, 5, 4, 1 , 8, 2, 1}; 
        try {
            System.out.print("The numbers are: ");
            for(int n = 0; n < num.length; n++) {
                if(n < num.length - 1) {
                    System.out.print(n + ", ");
                } else {
                    System.out.print(n + "\n");
                }
            }
            int resultIndex = findMiddleIndex(num);
            System.out.println("Starting from index 0, adding numbers till index " + resultIndex + " and"); 
            System.out.println("adding rest of the numbers can be equal. The value in that position is " + num[resultIndex]); 
        } catch (Exception ex) { 
            System.out.println(ex.getMessage()); 
        } 
    } 

} 
