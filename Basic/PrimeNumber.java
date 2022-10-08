import java.util.Scanner;

class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=scanner.nextInt();
		int flag=1;
		for(int i=2; i<=num/2; i++)
		{
			if(num%2==0)
				flag=0;
				break;
		}
		if(flag==1)
			System.out.println(num+" is a prime Number");
		else
			System.out.println(num+" is a not prime Number");
	}
}