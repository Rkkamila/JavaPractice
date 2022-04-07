package BasicJava;

public class CountCharinString {

	public static void main(String[] args)

	{
		 String str="Bq1@";
		 int count=0,length=0,num=0;
		 int upper = 0,lower=0,number=0,special=0;
		 

		 length=str.length();
		 
		 for(int i=0; i<length; i++)
		 {
			count=0;
		    for(int j=0; j<length; j++)
		    {
		        if(str.charAt(j)==str.charAt(i))
		        count++;
		    }
		    for(int k=0; k<i; k++)
		    {
		        if(str.charAt(k)==str.charAt(i))
		        num=1;
		    }
		        if(num!=1)
	
		          System.out.print(str.charAt(i)+" is occured: "+count+" "+"times"+"\n");
		      num=0;
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	            {
	            	upper++;
	            	
	            }
	            else if (ch >= 'a' && ch <= 'z')
	            {
	            	
	                lower++;
	            }
	            else if (ch >= '0' && ch <= '9')
	                number++;
	            else
	                special++;
	            
		 }
		 System.out.println("Capital Alphabets count is :" +" "+upper);
		 System.out.println("Small Alphabets count is :" +" "+lower);
		 System.out.println("Numbers count is :" +" "+number);
		 System.out.println("Special count is :" +" "+special);
	}
}
