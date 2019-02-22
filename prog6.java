class prog6
{
 public static void main(String args[])
 {
	int n=Integer.parseInt(args[1]);
	//System.out.println(n);
 	if(args[0].equals("Male"))
	{
		if(n>=1 && n<=58)
			System.out.println("8.4%");
                if(n>=59 && n<=100)
			System.out.println("10.5%");
	}
	if(args[0].equals("Female"))
	{
		if(n>=1 && n<=58)
			System.out.println("8.2%");
		if(n>=59 && n<=100)
			System.out.println("9.2%");
	}
 	
 }
}
