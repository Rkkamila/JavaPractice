package BasicJava;

public class RemoveLeadingZeros {

	public static void main(String[] args)

	{
		int[] arr = {0, 0, 4, 0, 5, 0,0};
		boolean result=false;
		
		for (int i = 0; i < arr.length; i++) 
			
		{
		    if((arr[i] != 0) || result)
		    {
		        System.out.print(arr[i]+ " ");
		        result= true;
		    }
		}

	}
}
