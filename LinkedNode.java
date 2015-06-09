package com.github.ashikuzzaman.javaapichecks.threads;

/** 
Write a Singly Likned Linear List of your own. Likned List has 
- O(1) insert/delete time complexity in begginning/head
- O(n) insert/delete time complexity in ending/tail

@author ashik
 
to compile: javac -d . LinkedNode.java
to run: java com.github.ashikuzzaman.javaapichecks.threads.LinkedNode
or,     java com.github.ashikuzzaman.javaapichecks.threads.LinkedNode sort
or,     java com.github.ashikuzzaman.javaapichecks.threads.LinkedNode find
or,     java com.github.ashikuzzaman.javaapichecks.threads.LinkedNode remove
*/

public class LinkedNode {
      
    public static void main(String a[]){
        int length = 10;
        LinkedNode myNode = new LinkedNode(length); // head
        LinkedNode nodeToRemove = null;
        System.out.println("Node starts at  = " + myNode.data);
        for(int i=length-1; i>0; i--){
            myNode = myNode.insert(myNode, i);
            if(i == 5) {
                nodeToRemove = myNode;
            }
            System.out.println("during insert myNode.data for " + i + " = " + myNode.data);
        }
        if(a.length > 0) {
            if("sort".equalsIgnoreCase(a[0])) {
                myNode = myNode.insertSorted(myNode, 7); 
            } else if ("find".equalsIgnoreCase(a[0])) {
                LinkedNode foundNode = myNode.find(myNode, 8);
                System.out.println("Searched and found the node for " + foundNode.data);
            } else if ("remove".equalsIgnoreCase(a[0])) {
                LinkedNode removeddNode = myNode.remove(myNode, nodeToRemove);
                System.out.println("Removed the node for " + removeddNode.data);
            } 
        } else {
            myNode = myNode.insert(myNode, 7);    
        }

        while(myNode != null) {
            System.out.println("after insert done, myNode.data for " + " = " + myNode.data);
            myNode = myNode.next;
        }
    }

    LinkedNode next;
    int data;

    public LinkedNode(int data) {
        this(null, data);
    }
    public LinkedNode(LinkedNode head, int data) {
        this.next = head;
        this.data = data;
    }

    public LinkedNode insert(LinkedNode head, int data) {
        return new LinkedNode(head, data);
    }

    public LinkedNode insertSorted(LinkedNode head, int data) {
        System.out.println("inserting data = " + data + " where head = " + head.data);
        if(head == null || data <= head.data) {
            return new LinkedNode(head, data);
        }
        
        LinkedNode current = head;
        while(current.next != null && current.next.data < data) {
            current = current.next;
        }  

        if(current.next == null) {
            current.next = new LinkedNode(data);
        } else {
            current.next = new LinkedNode(current.next, data);
        }

        return head;
    }

    public LinkedNode find(LinkedNode head, int value) {
        while(head != null && head.data != value) {
            System.out.println("Checking data for match = " + head.data);
            head = head.next;
        }

        return head;
    }

    public LinkedNode remove(LinkedNode head, LinkedNode target) {
        while(head != null && head == target) {
            head = head.next;
        }
        if (head == null) {
            // could not find a matching target so nothing to remove
            return null;
        }

        LinkedNode current = head;
        while(current.next != null) {
            if(current.next == target) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }
}

