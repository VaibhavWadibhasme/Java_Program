import java.util.Scanner;

class Sum
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Two Integer Number: ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=a+b;
		System.out.println("Sum of two Number: "+c);
	}
}