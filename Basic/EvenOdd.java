import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Any Number :");
		int num=scanner.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even Number");
		else
			System.out.println(num+" is Odd Number");
	}
}