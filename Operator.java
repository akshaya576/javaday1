package Javaprgm1;

public class Operator {
public static void main (String[] args) {
	/*int a=50;
	int b=60;
	
	//Arithmetic operators:
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	//Relational operator:
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	
	//Logical operator:
	System.out.println(a<b && a==50);
	System.out.println(a<b || a==50);*/
	
	//Unary operators:
	/*int a=10;
			//post increment
	System.out.println(a);
	System.out.println(a++);
	System.out.println(a);*/
			//pre increment
	/*System.out.println(a);
	System.out.println(++a);
	System.out.println(a);*/
	
	/*//unary operators:
	int a=100;
	System.out.println(a+=200);*/
	
 /*//bitwise operator
	//with temp operator
	int a=10;
	int b=20;
	int c=0;
	c=b; //20
	b=a; //10
	a=c;
	System.out.println(a);
	System.out.println(b);*/
	
	//without temp operator
	/*int a=10;
	int b=20;
	
	System.out.println(a+=a);
	System.out.println(b-=b);*/
	
	int age=18;
	String result=(age>=18)?"Eligible to vote" : "Not eligible to vote";
	System.out.println(result);
}
}
