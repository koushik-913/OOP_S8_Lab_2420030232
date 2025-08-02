package lab1;
import java.util.Scanner;
public class volume6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numbers = {10,20,30,40,50};

int sum =0;
double average ;
for	(int num : numbers) {
	sum +=num;
}
 average =(double)sum /numbers.length;
	
	System.out.println("sum of array values:" +sum);
	System.out.println("Average of array values:" + average);
	}
}