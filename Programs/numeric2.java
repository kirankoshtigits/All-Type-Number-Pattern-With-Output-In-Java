class numeric2
{
	public static void main(String args[])
	{
		int i,j;
		int count=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(+count);
				count++;
			}
			System.out.println("");
		}
	}
}

//OUTPUT//
/*
		1
		2 3
		4 5 6
		7 8 9 10
*/