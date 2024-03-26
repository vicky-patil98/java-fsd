package com.assistedpract.practice1;

public class P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java"; 
        
		// conversion from String object to StringBuffer 
		StringBuffer sbr = new StringBuffer(str); 
		sbr.reverse(); 
		System.out.println("String to StringBuffer");
		System.out.println(sbr); 
		  
		// conversion from String object to StringBuilder 
		StringBuilder sbl = new StringBuilder(str); 
		sbl.append("world"); 
		System.out.println("String to StringBuilder");
		System.out.println(sbl); 

	}

}
