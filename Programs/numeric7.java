class numeric7
{
	public static void main(String args[])
	{
		int i,j;
		int count=10;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(count);
				count--;
			}
			System.out.println("");
		}
	}
}
//OUTPUT//
/*
	 10 9 8 7 
	 6 5 4
	 3 2
	 1
*/