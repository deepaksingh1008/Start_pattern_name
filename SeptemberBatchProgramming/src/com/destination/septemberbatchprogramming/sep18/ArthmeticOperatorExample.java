package com.destination.septemberbatchprogramming.sep18;

class ArithemticOperation{
	 void add(int a,int b) {
		 int res1 = a+b;
		 System.out.println("Addition Result is : "+(res1));
		 System.out.println("===========");
	 }
	 void sub(int a,int b) {
		 int res1 = a-b;
		 System.out.println("Sub Result is : "+(res1));
		 System.out.println("===========");
	 }
	 void mul(int a,int b) {
		 int res1 = a*b;
		 System.out.println("Mul Result is : "+(res1));
		 System.out.println("===========");
	 }
	 void div(int a,int b) {
		 int res1 = a/b;
		 System.out.println("Divide Result is : "+(res1));
		 System.out.println("===========");
	 }
	 void mod(int a,int b) {
		 int res1 = a%b;
		 System.out.println("mod is : "+(res1));
		 System.out.println("===========");
	 }
	
}


public class ArthmeticOperatorExample {

	public static void main(String[] args) {
		System.out.println("====== Arthematic Oprator=====");
		int a = 100;
		int b = 50;
		ArithemticOperation obj=new ArithemticOperation();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
		obj.div(a, b);
		obj.mod(a, b);
		
 
	}

}
