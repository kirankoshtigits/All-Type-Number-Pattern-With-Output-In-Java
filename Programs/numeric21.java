class numeric21
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print("1 ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
}
//OUTPUT//
/*
	1 1 1 1
	1 1 2 2
	1 3 3 3
	4 4 4 4
*/