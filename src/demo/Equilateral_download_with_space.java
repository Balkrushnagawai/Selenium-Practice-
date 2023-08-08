package demo;

public class Equilateral_download_with_space {
	public static void main(String[]args)
	{
		int space =8;
		int star=1;
		for(int a=1; a<=8; a++)
		{
			for(int i=1; i<=space; i++)
			{ 
				System.out.print("  ");
			}
			for(int i=1; i<=star; i++)
			{
				System.out.print(" *");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
