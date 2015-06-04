package com.github.ashikuzzaman.javaapichecks.langfunds;

import java.util.List;
import java.util.ArrayList;

/** 
Write a program to replace a the even number occurrance of a character in a string with another string. 

@author ashik
 
to compile: javac -d . ReplaceStringEvenOccurrance.java
to run: java com.github.ashikuzzaman.javaapichecks.langfunds.ReplaceStringEvenOccurrance

output will look like -

indexes = [7, 32, 70, 86]
Replacement String is = Object ?riented programming is s?mething very intuitive if you have th?ugh of it the c?rrect way!

*/

public class ReplaceStringEvenOccurrance { 
    public String replaceString(String value, Character oneChar, Character replacementChar) { 
        List<Integer> indexes = new ArrayList<Integer>();
        Boolean evenOccurrance = true;
        for(int i= 0; i < value.length(); i++ ) {
            if(value.charAt(i) == oneChar) {
                if(evenOccurrance) {
                    indexes.add(i);
                }
                evenOccurrance = (! evenOccurrance);
            }
        }
        System.out.println("indexes = " + indexes);
        StringBuffer sbf = new StringBuffer(value);
        for(int j = 0; j < indexes.size(); j++) {
            sbf.setCharAt(indexes.get(j), replacementChar);
        }
        // System.out.println("Replacement String is = " + sbf.toString());
        return sbf.toString();
    } 

    public static void main(String []a) {
        String myValueToReplace = "Object oriented programming is something very intuitive if you have though of it the correct way!";
        Character oneChar = 'o';
        Character replacementChar = '?';
        ReplaceStringEvenOccurrance rep = new ReplaceStringEvenOccurrance();
        System.out.println("Start....");
        System.out.println("Replacement String is = " + rep.replaceString(myValueToReplace, oneChar, replacementChar));
        System.out.println("End....");
     
     }
}
