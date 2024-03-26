package com.assistedpract.practice1;

public class P02 {

    public int publicField = 10;
    private int privateField = 20;
    protected int protectedField = 30;
    int defaultField = 40;
    
	void display()
	{
		System.out.println("You are using defalut access specifier");
	}
	
	private void privateMethod() 
	{ 
	    System.out.println("You are using private access specifier"); 
	}
	
	protected void protectedMethod() 
	{ 
	    System.out.println("This is protected access specifier"); 
	}
	
	public void publicMethod() 
	{ 
	    System.out.println("This is Public Access Specifiers"); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P02 acc = new P02();
		
        System.out.println("Accessing fields:");
        System.out.println("publicField: " + acc.publicField);
        System.out.println("protectedField: " + acc.protectedField);
        System.out.println("defaultField: " + acc.defaultField);
        
        System.out.println("\nAccessing methods:");
		acc.display();
		acc.publicMethod();
		acc.protectedMethod();
		
		acc.privateMethod();
		

	}

}
