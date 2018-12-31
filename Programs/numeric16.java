class numeric16
{
	public static void main(String args[])
	{
		int i,j,k;
		int num=1;
		for(i=1;i<=4;i++)
		{
			for(j=i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
		for(i=3;i>=1;i--)
		{
			for(j=1;j<=num;j++)
			{
				System.out.print(" ");
			}
			num++;
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
}

//OUTPUT//
/*
		1
	   1 2
	  1 2 3
	 1 2 3 4
	  1 2 3
	   1 2
	    1
*/