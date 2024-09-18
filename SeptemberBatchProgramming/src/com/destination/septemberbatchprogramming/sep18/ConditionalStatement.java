package com.destination.septemberbatchprogramming.sep18;

class Conditional{
	 void greater(int a,int b) {
		Boolean res1 = a>b;
		 System.out.println("Greater than is : "+(res1));
		 System.out.println("===========");
	 }
	 void less(int a,int b) {
		 Boolean res1 = a<b;
		 System.out.println("less than  : "+(res1));
		 System.out.println("===========");
	 }
	 void greaterOrEqual(int a,int b) {
		 Boolean res1 = a>=b;
		 System.out.println("greater than or equal to : "+(res1));
		 System.out.println("===========");
	 }
	 void lessOrEqual(int a,int b) {
		Boolean res1 = a<=b;
		 System.out.println("less than or equal to : "+(res1));
		 System.out.println("===========");
	 }
	 void equalTo(int a,int b) {
		 Boolean res1 = a==b;
		 System.out.println("Equal to : "+(res1));
		 System.out.println("===========");
	 }
	 void isNotEqualto(int a,int b) {
		 Boolean res1 = a!=b;
		 System.out.println("Is not equal to: "+(res1));
		 System.out.println("===========");
	 }
	 
	
}

public class ConditionalStatement {
public static void main(String[] args) {
	Conditional obj = new Conditional();
	int a = 100;
	int b = 50;
	obj.greater(a, b);
	obj.less(a, b);
	obj.equalTo(a, b);
	obj.greaterOrEqual(a, b);
	obj.lessOrEqual(a, b);
	obj.isNotEqualto(a, b);
	
}
}
