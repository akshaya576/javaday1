package Javaprgm1;

import java.util.Scanner;

public class Scan {
public static void main(String[] args) {
	Scanner S1 = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = S1.nextLine();
	System.out.println("My name is"+name);
	System.out.println("Enter your mark:");
	int marks = S1.nextInt();
	System.out.println("Mark is"+marks);
}
}
