class numeric23
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=i;j<=4;j++)
			{
				System.out.print(j+" ");
			}
			for(k=3;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
}
//OUTPUT//
/*
	1 2 3 4 3 2 1
	2 3 4 3 2
	3 4 3
	4
*/