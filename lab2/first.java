package lab2;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the alphabet:");
Scanner sc= new Scanner(System.in);
char n;
n=sc.next().charAt(0);
if(n>=65&&n<=90) {
	System.out.println("character is an alphabet");
}
else if(n>97&&n<=122) {
	System.out.println("character is an  alphabet");
}
else {
	System.out.println("character is not an alphabet");
}
	}

}
