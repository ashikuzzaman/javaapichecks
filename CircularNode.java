package com.github.ashikuzzaman.javaapichecks.collections;

/** 
Write a Circular Singly Likned List of your own. 
As random access is not supported in linked list, each node needs to be traversed making it a linear search.
Circular Linked list has its tail pointing to head as next element.

@author ashik
 
to compile: javac -d . CircularNode.java
to run: java com.github.ashikuzzaman.javaapichecks.collections.CircularNode
*/

public class CircularNode {
      
    public static void main(String a[]){
        int length = 10;
        CircularNode myNode = new CircularNode(length); // head
        CircularNode nodeToRemove = null;
        System.out.println("Node starts at  = " + myNode.data);
        for(int i=length-1; i>0; i--){
            myNode = myNode.insert(myNode, i);
            if(i == 5) {
                nodeToRemove = new CircularNode(myNode, 5);
                // nodeToRemove = myNode;
            }
            System.out.println("during insert myNode.data for " + i + " = " + myNode.data);
        }
        if(a.length > 0) {
            if ("find".equalsIgnoreCase(a[0])) {
                CircularNode foundNode = myNode.find(myNode, 8);
                System.out.println("Searched and found the node for " + foundNode.data);
            } else if ("remove".equalsIgnoreCase(a[0])) {
                CircularNode removeddNode = myNode.remove(myNode, nodeToRemove);
                System.out.println("Removed the node for " + removeddNode.data);
            } 
        } else {
            myNode = myNode.insert(myNode, 7);    
        }

        while(myNode != null) {
            System.out.println("after insert done, myNode.data = " + myNode.data);
            myNode = myNode.next;
        }
    }

    CircularNode next;
    int data;

    public CircularNode(int data) {
        this(null, data);
    }
    public CircularNode(CircularNode head, int data) {
        this.next = head;
        this.data = data;
    }

    public CircularNode insert(CircularNode head, int data) {
        System.out.println("During insertion, head.data = " + head.data + " and data = " + data);
        CircularNode insertion = new CircularNode(data);
        if(head == null) {
            insertion.next = insertion;
            return insertion;
        }

        if(head.next != null && head.data == head.next.data) {
            head.next = insertion;
            insertion.next = head;
            return insertion;
        }

        int headData = head.data;
        insertion.data = headData;
        head.data = data;
        insertion.next = head.next;
        head.next = insertion;

        return head;
    }

    public CircularNode find(CircularNode head, int value) {
        CircularNode current = head;
        while(current != null && current.data != value) {
            current = current.next;
            // use the head data to see if you have finished the loop
            if(current.data == head.data) {
                // that means you didn't find the value in this list
                return null;
            }
        }
        return current;
    }

    public CircularNode remove(CircularNode head, CircularNode target) {
        System.out.println("while removing, head.data = " + head.data + " and target.data = " + target.data);
        if(head == null || ( head == target && head.next == target)) {
            return null;
        }

        CircularNode next = target.next;
        target.data = next.data;
        target.next = next.next;

        return target;
    }
}

