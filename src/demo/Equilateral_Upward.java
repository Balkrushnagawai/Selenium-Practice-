package demo;

public class Equilateral_Upward {
	public static void main(String[]args)
	{
		int star=1;
		int space=7;
		for(int i=1; i<=7; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
