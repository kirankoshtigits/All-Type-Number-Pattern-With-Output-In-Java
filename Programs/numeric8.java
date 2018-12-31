class numeric8
{
	public static void main(String args[])
	{
		int i,j;
		for(i=4;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		for(i=1;i<=4;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
//OUTPUT//
/*
	4 3 2 1
	3 2 1
	2 1
	1
	1 
	2 1
	3 2 1
	4 3 2 1
*/