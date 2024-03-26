package com.assistedpract.practice1;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicite type casting");
		char val = 'G';
		System.out.println("Value of val =:"+val);
		int intVal = val;
		System.out.println("Value of intVal =:"+intVal);
		float floatVal = val;
		System.out.println("Value of floatVal =:"+floatVal);
		double dVal = val;
		System.out.println("Value of dVal =:"+dVal);
		
		System.out.println();
		System.out.println("Explicite type casting");
        double d1 = 10.5;
        System.out.println("Double value: " + d1);
        float f1 = (float) d1;
        System.out.println("Float value: " + f1);
        long l1 = (long) f1;
        System.out.println("Long value: " + l1);
        int i1 = (int) l1;
        System.out.println("Int value: " + i1);
	}

}
