package BasicJava;

public class ShiftAllZeroToEnd {

	public static void main(String[] args)
	
	{
		int arr[] = {0,1,0,2,3};
		int len = arr.length;
		int count = 0;
		for(int i = 0; i < len; i++) 
		{
			if(arr[i] != 0) 
			{
			arr[count++] = arr[i]; // move all element to First
			
			}
		}
	  
		while(count < len) 
		{
			arr[count++] = 0;  // Adding Zeros to end
		}
		
		for(int j = 0; j < len; j++) 
		{
			System.out.print(arr[j] + " ");
		}
	}

}
