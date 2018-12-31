class numeric25
{
	public static void main(String args[])
	{
		int i,j;
		int k;
		for(i=4;i>=1;i--)
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			for(k=i;k>1;k--)
			{
				System.out.print("4 ");
			}
			System.out.println();
		}
	}
}
//OUTPUT//
/*
	4 4 4 4
	3 4 4 4
	2 3 4 4
	1 2 3 4
*/