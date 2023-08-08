package demo;

public class Equilateral_download {
	public static void main(String[]args)
	{
		int star=9;
		int space=1;
		for(int i=1; i<=5; i++)
		{
			for (int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			star=star-2;
			space++;
		}
	}

}
