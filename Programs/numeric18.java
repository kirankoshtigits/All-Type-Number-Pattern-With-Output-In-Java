class numeric18
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=4;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
		for(i=4;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=4;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}
}
//OUTPUT//
/*
	1 2 3 4
	 2 3 4
	  3 4
	   4
	   4
	  3 4
	 2 3 4
	1 2 3 4
*/