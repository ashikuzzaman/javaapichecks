package com.github.ashikuzzaman.javaapichecks.threads;

import java.util.List;
import java.util.ArrayList;

/** 
In case we want to access group of objects comes from same family, means extending same super class, 
we can restrict the generics type parameter to a certain group of objects which extends same super class. 
We can achieve this by specifying extends <super-class> at class definitions.

@author ashik
 
to compile: javac -d . GenericsCheck.java
to run: java com.github.ashikuzzaman.javaapichecks.threads.GenericsCheck

*/

public class GenericsCheck {
 
    public static void main(String a[]) {
        //Creating object of sub class C and
        //passing it to BoundEx as a type parameter.
        BoundEx<C> bec = new BoundEx<C>(new C());
        bec.doRunTest();
        //Creating object of sub class B and
        //passing it to BoundEx as a type parameter.
        BoundEx<B> beb = new BoundEx<B>(new B());
        beb.doRunTest();
        //similarly passing super class A
        BoundEx<A> bea = new BoundEx<A>(new A());
        bea.doRunTest();
        //If you uncomment below code it will throw compiler error
        //becasue we restricted to only of type A and its sub classes.
        //BoundEx<String> bes = new BoundEx<String>(new String());
        //bea.doRunTest();
    }
}

/**
 * This class only accepts type parametes as any class
 * which extends class A or class A itself.
 * Passing any other type will cause compiler time error
 */
class BoundEx<ChildOrSelf extends A> {
     
    private ChildOrSelf objRef;
     
    public BoundEx(ChildOrSelf obj){
        this.objRef = obj;
    }
     
    public void doRunTest(){
        this.objRef.printClass();
    }
}
 
class A {
    public void printClass(){
        System.out.println("I am in super class A");
    }
}
 
class B extends A {
    public void printClass(){
        System.out.println("I am in sub class B");
    }
}
 
class C extends A {
    public void printClass(){
        System.out.println("I am in sub class C");
    }
}

