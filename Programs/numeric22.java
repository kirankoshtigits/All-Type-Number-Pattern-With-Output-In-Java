class  numeric22
{
	public static void main(String args[])
	{
		int i,j;
		int k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j<i)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			for(k=4;k>i;k--)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
//OUTPUT//
/*
	1 0 0 0
	0 2 0 0 
	0 0 3 0
	0 0 0 4
	0 0 0 4
*/