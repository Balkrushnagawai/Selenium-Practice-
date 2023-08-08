package demo;

public class Triangle_Right_Descending {
	public static void main (String[]args)
	{
		int star=10;
		int space=1;
		for(int i=1; i<=10; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			star--;
			space++;
		}
	}

}
