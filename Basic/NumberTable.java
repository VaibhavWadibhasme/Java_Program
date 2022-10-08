import java.util.Scanner;

class NumberTable
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=scanner.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
	}
}