package lab1;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		int r;
		 float pi=3.14f;
		 double vol;
		 System.out.println("enter the radius");
		 Scanner sc=new Scanner(System.in);
		 r=sc.nextInt();
		 vol =4/3*pi*r*r;
		 System.out.println("volume of sphere is:" +vol);
	 }

	}


