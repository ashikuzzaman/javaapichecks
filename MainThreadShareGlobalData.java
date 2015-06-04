package com.github.ashikuzzaman.javaapichecks.threads;

import java.util.List;
import java.util.ArrayList;

/** 
Write a program to replace a the even number occurrance of a character in a string with another string. 

@author ashik
 
to compile: javac -d . MainThreadShareGlobalData.java
to run: java com.github.ashikuzzaman.javaapichecks.threads.MainThreadShareGlobalData

output will look like -

indexes = [7, 32, 70, 86]
Replacement String is = Object ?riented programming is s?mething very intuitive if you have th?ugh of it the c?rrect way!

*/

public class MainThreadShareGlobalData extends Thread {

    public static int MAX_COUNT = 20;

    public static void main(String a[]) {
        System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnableThread.myCount <= MAX_COUNT) {
            try {
                System.out.println("Main Thread: " + Thread.currentThread().getName() + (++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

class MyRunnableThread implements Runnable {
 
    public static int myCount = 0;
    public MyRunnableThread() {
    }

    public void run() {
        while(MyRunnableThread.myCount <= MainThreadShareGlobalData.MAX_COUNT) {
            try {
                System.out.println("Worker Thread: " + Thread.currentThread().getName() +(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
