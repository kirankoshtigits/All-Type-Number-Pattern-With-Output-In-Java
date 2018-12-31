class numeric13
{
	public static void main(String args[])
	{
		int i,j;
		int temp;
		for(i=1;i<=4;i++)
		{
			temp=i;
			for(j=i;j>=1;j--)
			{
				System.out.print(temp);
				temp=temp+4;
			}
			System.out.println("");
		}
	}
}

//OUTPUT//
/*
	1
	2 6
	3 7 11
	4 8 12 16
*/