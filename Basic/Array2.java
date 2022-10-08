import java.util.Scanner;

class Array2
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int[] a=new int[10];

		System.out.println("Enter the Element into Array: ");
		for(int i=0; i<a.length; i++)
			a[i]=scanner.nextInt();
		System.out.println("Array Element");
		for(int i=0; i<a.length; i++)
			System.out.println(" "+a[i]);
	}
}