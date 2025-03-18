package Javaprgm1;

import java.util.Scanner;

public class ControlStatement {
public static void main(String[] args) {
/*int a=10;
int b=20;
if(a<b)
{
	System.out.println("A lesser than B");	
}
else
{
	System.out.println("B lesser that A");
}
}
}*/

//nested if 
	/*int a=10;
	int b=20;
 if (a<b)
 {
	 if(a%2==0) {
		 System.out.println(a+"Even number");
	 }
  }
 else
 {
	 System.out.println("exit");
 }*/
	
 //ladder if
/*int a=300;
int b=300;
int c=300;
if(a>b && a>c)
{
	System.out.println("A is greater");
}
else if(b>a && b>c)
{
	System.out.println("B is greater");
}
else if(c>b && c>a)
{
	System.out.println("C is greater");
}
else
{
	System.out.println("All numbers are equal");
}*/
 Scanner s1=new Scanner(System.in);
int a = s1.nextInt();
 int b = s1.nextInt();
 char choice;
 System.out.println("+,-");
 choice = s1.next().charAt(0);
 switch (choice)
 {
 case '+':
	 int c=a+b;
	 System.out.println("ADD"+c);
	 break;
	 
 case '-':
 	int d=a-b;
 	System.out.println("SUB"+d);
 	break;
 	
 default:
	 System.out.println("invalid choice");
	 break;
 }
 
}
}



 
 
 
