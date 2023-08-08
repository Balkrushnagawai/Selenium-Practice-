package demo;

public class Triangle_Left_Descending {
	public static void main (String[]args)
	{
		int star=10;
		
		for(int i=1; i<=10; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
		}
	}

}
