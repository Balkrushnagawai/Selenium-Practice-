package stringProgram;

public class String_Reverse {
	public static void main (String[]args)
	{
		String ak ="I Love India";
		String as="";
		
		for(int i=ak.length()-1; i>=0; i--)
		{
			as =as+ak.charAt(i);
		}
		System.out.println(as);
	}
	

}
