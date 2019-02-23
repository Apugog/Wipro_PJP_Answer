class prog7
{
	public static void main(String args[])
	{
		char a=args[0].charAt(0);
		if(a>64 && a<91)
		{ 
			System.out.println(a+"->"+args[0].toLowerCase());
		}
		else
                { 	
			System.out.println(a+"->"+args[0].toUpperCase());
		}

	}
}
