package demo;

public class Des_asc {
	public static void main(String[] args) {
		int star=10;
		int space=0;
		for(int i=1; i<=20; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			System.out.println();
			if(i<=9)
			{
				star--;
				space++;
			}
			else
			{
				star++;
				space--;
			}
			
			
		}
	}

}
