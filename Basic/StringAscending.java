class StringAscending
{
	public static void main(String args[])
	{
		String str="java";
		System.out.println("Original String :"+str);
		char[] str1=str.toCharArray();
		for(int i=0; i<str1.length; i++)
		{
			for(int j=i+1; j<str1.length; j++)
			{
				if(str1[i]>str1[j])
				{
					char temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
				}
			}
		}
		String str2=new String(str1);
		System.out.println("String in Ascending order :"+str2);
	}
}