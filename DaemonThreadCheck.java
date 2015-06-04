package com.github.ashikuzzaman.javaapichecks.threads;

import java.util.List;
import java.util.ArrayList;

/** 
Write a program to replace a the even number occurrance of a character in a string with another string. 

@author ashik
 
to compile: javac -d . DaemonThreadCheck.java
to run: java com.github.ashikuzzaman.javaapichecks.threads.DaemonThreadCheck

output will look like -

indexes = [7, 32, 70, 86]
Replacement String is = Object ?riented programming is s?mething very intuitive if you have th?ugh of it the c?rrect way!

*/

public class DaemonThreadCheck extends Thread {
     
    public DaemonThreadCheck(boolean define) {
        setDaemon(define);
    }
    public void run(){
        System.out.println(this.getName() + " - Is this thread Daemon? - "+isDaemon());
    }
    public static void main(String a[]){
        DaemonThreadCheck dtc1 = new DaemonThreadCheck(true);
        DaemonThreadCheck dtc2 = new DaemonThreadCheck(false);
        // even you can set daemon constraint here also
        // it is like dtc1.setDeamon(true)
        dtc1.start();
        dtc2.start();
        try {
            // wait a bit so that the program doesn't exit before the other daemon thread gets a chance to run / print
            Thread.sleep(200);
        } catch(InterruptedException iex) {

        }
    }
}
