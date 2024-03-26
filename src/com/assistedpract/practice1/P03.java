package com.assistedpract.practice1;

//method implementation
class MethodImplementation
{
	public void name()
	{
		System.out.println("Calling name method from MethodImplementation Class");
	}
	
    public void paramMethod(int value) {
        System.out.println("This is a parameterized method from MethodImplementation Class: " + value);
    }
}

//call by value
class CallValue
{
	int val = 100;
	
	public int newVal(int val)
	{
		val = val + 10;
		return val;
	}
}

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodImplementation meth1 = new MethodImplementation();
		meth1.name();
		meth1.paramMethod(100);
		
		CallValue v1 = new CallValue();
		System.out.println("Before the value of val is:"+v1.val);
		v1.newVal(200);
		System.out.println("After the value of val is:"+v1.val);

	}

}
