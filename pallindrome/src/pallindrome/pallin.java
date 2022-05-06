package pallindrome;
import java.util.Scanner;

public class pallin {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int rem ,rev = 0;
		int temp = num;
		while(num>0)
		{
			rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		if (temp == rev)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println(" not pallindrome");
		}
		
	}
	

}
