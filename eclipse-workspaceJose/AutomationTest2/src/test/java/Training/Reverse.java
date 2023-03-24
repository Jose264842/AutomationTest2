package Training;

public class Reverse 
{
    public static String rev(String s)
    {
    	
        char[] c = s.toCharArray();
        System.out.println();
        
        for (int i = 0; i < c.length; i += 2) 
        {
            char temp = c[i];
            c[i] = c[i + 1];
            c[i + 1] = temp;
        }
        return new String(c);
    }
	public static void main(String[] args) 
	{
		String s = "TECHNOLOGY";
		System.out.println("Given String Value is --> " + s);
		System.out.println("After Swap String Value is --> " +rev(s));    	        
	}

}
