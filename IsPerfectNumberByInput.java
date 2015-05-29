package com.java2novice.algos;

/** 
A perfect number is a positive integer that is equal to the sum of its proper positive divisors, 
that is, the sum of its positive divisors excluding the number itself. 
Equivalently, a perfect number is a number that is half the sum of all of its positive divisors. 
The first perfect number is 6, because 1, 2 and 3 are its proper positive divisors, 
and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all its positive divisors: 
( 1 + 2 + 3 + 6 ) / 2 = 6.

@author ashik
 
to compile: javac -d . IsPerfectNumberByInput.java
to run: java com.java2novice.algos.IsPerfectNumberByInput

*/

public class IsPerfectNumberByInput {
 
    public boolean isPerfectNumber(int number){
         
        int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
    }
     
    public static void main(String a[]){
        int input = 28;
        if(a.length == 0) {
            System.out.println("You did not supply a number. So will use default number 28.");
        } else {
            input = Integer.parseInt(a[0]);
        }
        IsPerfectNumberByInput ipn = new IsPerfectNumberByInput();
        System.out.println("Is perfect number: "+ipn.isPerfectNumber(28));
    }
}
