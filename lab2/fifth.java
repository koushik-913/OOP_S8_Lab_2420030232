package lab2;
import java.util.Scanner;
public class fifth {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the number");
	 Scanner sc = new Scanner(System.in);
	 
	 int num,i;
	 num =sc.nextInt();
	 int sum=0;
	  for(i=1;i<num;i++) {
		  if(num % i == 0 && i!=num) {
			  sum=sum+i;
		  }
	  }
	  if(sum==num) {
	  System.out.println("it is perfect number");
	  }
	  else {
		  System.out.println("it is not a perfect number");
	  }
		

		}
		
}



