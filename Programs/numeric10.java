class numeric10
{
	public static void main(String args[])
	{
		int i,j;
		for(i=4;i>=1;i--)
		{	
			for(j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
//OUTPUT//
/*
	4
	4 3
	4 3 2
	4 3 2 1
*/