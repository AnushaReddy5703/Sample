package pack1;

import java.util.Scanner;

public class Marks {
	void meth1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks out of 100 :");
	int num=sc.nextInt();
	
	if(num>=91 && num<=100)
	 {
		System.out.println("AA");
	 }
	else if(num>=81 && num<=90)
	 {
		System.out.println("AB");
	 }
	else if(num>=71 && num<=80)
	 {
		System.out.println("BB");
	 }
	else if(num>=61 && num<=70)
	 {
		System.out.println("BC");
	 }
	else if(num>=51 && num<=60)
	 {
		System.out.println("CD");
	 }
	else if(num>=41 && num<=50)
	 {
		System.out.println("DD");
	 }
	else if(num<0 || num>100)
	{
		System.out.println("Invalid input ! Marks Should be between 0 and 100");
	}
	else {
		System.out.println("Fail");
	}

	}
	
	public static void main(String[] args) {
		
	    Marks marks=new Marks();
	    marks.meth1();
	    
	}
	
}
