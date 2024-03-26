package com.assistedpract.practice1;

public class P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {10, 20, 30, 40, 50};

		System.out.println("Elements of the intArray:");
		for (int i = 0; i < intArray.length; i++) {
		    System.out.println("Element at " + i + " index : " + intArray[i]);
		}
		
		//multidimentional array
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        // printing 2D array
        System.out.println("\nMultidimentional array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

	}

}
