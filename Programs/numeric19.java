class numeric19
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=4;i>=1;i--)
		{
			for(j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(k=i;k<=4;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
}
//OUTPUT//
/*
	 4
	3 4
   2 3 4
  1 2 3 4
  
*/
