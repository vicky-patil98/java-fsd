package com.assistedpract.practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
        arrlist.add(15); 
        arrlist.add(20); 
        arrlist.add(25); 
        arrlist.add(32);
        arrlist.add(3, 35); 
        // prints all the elements available in list 
        for (Integer number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
        
        //LinkedList
        LinkedList<String> list = new LinkedList<String>();  
        list.add("AAA"); 
        list.add("BBB"); 
        list.add("10"); 
        list.add("CCC"); 
        list.add("20"); 
    
        System.out.println("LinkedList:" + list); 
        
        //Vector
        Vector<String> vec_tor = new Vector<String>();
        vec_tor.add("A");
        vec_tor.add("B");
        vec_tor.add("C");
        vec_tor.add("10");
        vec_tor.add("20");
 
        System.out.println("The vector is: " + vec_tor);
        
        // Creating an empty HashSet 
        HashSet<String> h = new HashSet<String>(); 
  
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
  
        // Adding duplicate elements 
        h.add("India"); 
        // Displaying the HashSet 
        System.out.println("HashSet:"+h);
	}
}
