import java.util.Scanner;

class InputTest
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any sentance");
		String str=scanner.nextLine();
		System.out.println("Sentence : "+str);

		System.out.println("Enter any String");
		String str1=scanner.next();
		System.out.println("String value : "+str1);

		System.out.println("Enter any Integer");
		int n=scanner.nextInt();
		System.out.println("Integer no. : "+n);

		System.out.println("Enter any Charater");
		char ch=scanner.next().charAt(0);
		System.out.println("Charater : "+ch);

		System.out.println("Enter any Float value");
		float n1=scanner.nextFloat();
		System.out.println("Float no. : "+n1);

		System.out.println("Enter any Double value");
		double n2=scanner.nextDouble();
		System.out.println("Double no. : "+n2);
	}
}