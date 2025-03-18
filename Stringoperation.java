package Javaprgm2;

import java.util.Scanner;

public class Stringoperation {
	public static void main(String[] args) {
		//displaying a string
      /*String name = new String("Ram");
        System.out.println(name);*/
	
		/*// entering a string	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a name:");
		String name=s1.nextLine();
		System.out.println(name);*/
		
		/*//length of a string
		String str="java lab";
		System.out.println(str.length());*/
	
		/*//substring
		String str="java programming";
		System.out.println(str.substring(3));//start index
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(0,5));*/
		
		/*//index of sub string
		String str="java programming";
		System.out.println(str.indexOf("rammin"));
		System.out.println(str.indexOf("z"));*/
	
		/*//touppercase tolowercase
		String str="java programming";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());*/
		
		/*//Replace
		String str="java programming";
		System.out.println(str.replace('m','M'));*/
		
		/*//Equals
		String str1="akshaya";
		String str2="AKSHAYA";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//it'll show truse because of ignore*/
	
		/*//char at
		String str="JAVA";
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));*/
	
		/*//split
		String str="java,python,springBoot";
		String []language =str.split(",");
		
		for(String s1 :language) {
			System.out.println(s1);
		}*/
		
		/*//concat
		String str1="java";
		String str2="programming";
		System.out.println("concat strring:"+str1.concat(str2));
		System.out.println("concat strring:"+str2.concat(str1));*/
		
		/*//trim
		String str ="  java  ";
		System.out.println(str.length());
		String str1= str. trim();
		System.out.println(str1);
		System.out.println(str1.length());*/
		
		/*//compare to
		String str1="JAVA";
		String str2="JAVA";
		System.out.println(str1.compareTo(str2));*/
		
		/*//contains
		String str="java programming is a lang";
		System.out.println(str.contains("java"));
		System.out.println(str.contains("python"));
		System.out.println(str.contains("lang"));*/
		
		/*//string intern
		String s1=new String("JavaDeveloper");
		String s2="JavaDeveloper";
		String s3=s1.intern();//changes from obj to normal string
		System.out.println(s1==s2);
		System.out.println(s2==s3);*/
		
	}
}
