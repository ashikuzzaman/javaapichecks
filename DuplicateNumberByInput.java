package com.java2novice.algos;
 
import java.util.ArrayList;
import java.util.List;

/** 
You have got a range of numbers between 1 to N, where one of the number is repeated. 
You need to write a program to find out the duplicate number. 

@author ashik
 
to compile: javac -d . DuplicateNumberByInput.java
to run: java com.java2novice.algos.DuplicateNumberByInput
 */

public class DuplicateNumberByInput {
 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Processing....");
        int start = 1, end = 30, duplicate = 23;
        if(a.length == 0) {
            System.out.println("Use default number 23");
        } else if(a.length == 1) {
            duplicate = Integer.parseInt(a[0]);
        } else if(a.length > 1) {
            end = Integer.parseInt(a[0]);
            duplicate = Integer.parseInt(a[1]);
            if(duplicate > end) {
                System.out.println("Error: You supplied a duplicate value outside of the range of the series.");
            }
        } 

        for(int i = start; i < end; i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(duplicate);

        DuplicateNumberByInput dn = new DuplicateNumberByInput();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
