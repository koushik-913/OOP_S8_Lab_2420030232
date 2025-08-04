package lab2;
import java.util.*;
public class fourth {

	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
		
		int Num1;
		int Num2;
		int i;
		int max = 0;
		
		System.out.println("enter numbers num1 and num 2 -> ");
		
		Num1 = sc.nextInt();
		Num2 = sc.nextInt();
		
	    for(i=1;i<=Num2;i++)
	    {
	    	if(Num1%i==0 && Num2%i==0)
	    	{
	    		if(i>=max)
	    		{
	    			max = i;
	    		}
	    	}
	    }
	    
	    System.out.println("The GCD of " + Num1 + " And " + Num2 + " is " + max);

	}

}



