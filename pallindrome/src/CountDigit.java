// pgm to count digit
import java.util.Scanner;

public class CountDigit 
{
	 static int count=0;
	 public static int count_digit(int n)
	 {
		  if(n<9)
		  {
			  count++;
		  }
		  else 
		  {
			  count++;
		 count_digit(n/10);  
		  }
		return count;
	 }

		public static void main(String[] args)  
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the digit");
		int n=s.nextInt();
		CountDigit ob=new CountDigit();
	    System.out.println("the no of digit is" +ob.count_digit(n));
		}
	}


