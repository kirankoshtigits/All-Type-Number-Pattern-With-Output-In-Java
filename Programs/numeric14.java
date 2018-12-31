class numeric14
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println(" ");
		}
	}
}

//OUTPUT//
/*
	1
	1 2 1
	1 2 3 2 1
	1 2 3 4 3 2 1
*/