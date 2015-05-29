package com.java2novice.algos;

import java.util.List;
import java.util.ArrayList;

/** 
Write a program to convert decimal number to binary format using numeric operations. 
Below example shows how to convert decimal number to binary format using numeric operations. 

@author ashik
 
to compile: javac -d . DecimalToBinaryByInput.java
to run: java com.java2novice.algos.DecimalToBinaryByInput

*/

public class DecimalToBinaryByInput { 
    public void printBinaryFormat(int number) { 
        int binary[] = new int[25]; 
        int index = 0; 
        
        while(number > 0) { 
            binary[index++] = number%2; 
            number = number/2; 
        } 
        for(int i = index-1;i >= 0;i--) { 
            System.out.print(binary[i]); 
        } 
    } 

    public static void main(String a[]) { 
        List<Integer> inputs = new ArrayList<Integer>();
        if(a == null || a.length < 1) {
            System.out.print("You have not supplied any number to convert.");
            return;
        }
        for(String s : a) {
            try {
                inputs.add(Integer.valueOf(s));
            } catch(NumberFormatException nfe) {
                System.err.println("The input " + s + " is not a valid Integer");
            }
        }
        DecimalToBinaryByInput dtb = new DecimalToBinaryByInput(); 
        System.out.println("\nStart printing....");
        for(Integer value : inputs) {
            dtb.printBinaryFormat(value); 
	    System.out.print("\n");
        }
        System.out.println("\nEnd printing....");
    } 
}
