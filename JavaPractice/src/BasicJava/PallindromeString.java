package BasicJava;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="1MADAM10";
		String Rev="";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			Rev=Rev+str.charAt(i);
			
		}
		
		if(str.equals(Rev))
		{
			System.out.println("This is a Pallindrome");
		}
		else
		{
			System.out.println("This is not a Pallindrome");
		}
	
	}

}
