package com.github.ashikuzzaman.javaapichecks.threads;

import java.util.List;
import java.util.ArrayList;

/** 
Below example exmplains what is wildcard arguments and how it helps us to solve problem. 
In the example, we have two classes called CompAEmp and CompBEmp extending Emp class. 
We have a generic class called MyEmployeeUtil, where we have utilities to perform employee functions 
irrespective of which comapany emp belogns too. This class accepts subclasses of Emp. 
Incase if we want to compare salaries of two employees, how can we do using MyEmployeeUtil class? 

@author ashik
 
to compile: javac -d . GenericsWildCardCheck.java
to run: java com.github.ashikuzzaman.javaapichecks.threads.GenericsWildCardCheck

*/

public class GenericsWildCardCheck {
 
    public static void main(String a[]){
         
        MyEmployeeUtil<CompAEmp> empA
                    = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Ashik", 20000));
        MyEmployeeUtil<CompBEmp> empB
                    = new MyEmployeeUtil<CompBEmp>(new CompBEmp("Yateesh", 30000));
        MyEmployeeUtil<CompAEmp> empC
                    = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Shishir", 20000));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
    }
}
 
class MyEmployeeUtil<T extends Emp>{
     
    private T emp;
     
    public MyEmployeeUtil(T obj){
        emp = obj;
    }
     
    public int getSalary(){
        return emp.getSalary();
    }
     
    public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){
         
        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
     
    //// create some utility methods to do employee functionalities
    //
    //
    //
}
 
class Emp{
     
    private String name;
    private int salary;
     
    public Emp(String name, int sal){
        this.name = name;
        this.salary = sal;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
 
class CompAEmp extends Emp{
     
    public CompAEmp(String nm, int sal){
        super(nm, sal);
    }
}
 
class CompBEmp extends Emp{
     
    public CompBEmp(String nm, int sal){
        super(nm, sal);
    }
}
