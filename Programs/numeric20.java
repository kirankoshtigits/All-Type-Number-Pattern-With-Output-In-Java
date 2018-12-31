class numeric20
{
	public static void main(String args[])
	{
		int i,j,k,m;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(m=i-1;m>=1;m--)
			{
				System.out.print(m+" ");
			}
			System.out.println("");
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