package com.assistedpract.practice1;

public class P04 {

    // Class variables
    private String name;
    private int age;

    // Constructor with no parameters (default constructor)
    public P04() {
        this.name = "Vikas";
        this.age = 0;
    }

    // Constructor with parameters
    public P04(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
    	P04 obj1 = new P04();
    	P04 obj2 = new P04("Vinay", 25);

        // Displaying information for both objects
        System.out.println("Information for object 1:");
        obj1.displayInfo();
        System.out.println("\nInformation for object 2:");
        obj2.displayInfo();
    }

}
