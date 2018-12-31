class numeric26
{
	public static void main(String args[])
	{
		int i,j,k;
		int num=5,temp;
		for(i=1;i<=4;i++)
		{
			temp=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(+temp+" ");
				temp=temp+4-j;
			}
			System.out.println();
			
		}
	}
}