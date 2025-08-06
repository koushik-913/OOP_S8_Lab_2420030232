package lab2;
import java.util.*;
public class third {

		public static void main(String[] args)
		{
	         Scanner sc = new Scanner(System.in);
			
			int num;
			System.out.println("enter num");

			num = sc.nextInt();
			
			int Sum=0;
			int n;
			
			while(num>0)
			{
				n=num%10;
				
				Sum=Sum+n;
				
				num=num/10;
			}
			
			System.out.println("sum -> " +Sum);

		}

	}


