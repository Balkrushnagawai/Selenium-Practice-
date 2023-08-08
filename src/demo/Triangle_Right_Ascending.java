package demo;

public class Triangle_Right_Ascending {
	public static void main (String[]args)
	{
		int space=7;
		int star=1;
		for(int i=1; i<=8; i++)
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
			star++;
		}
	}

}
