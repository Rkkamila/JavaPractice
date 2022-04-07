package BasicJava;

public class SecondLargestWOSorting {

	public static void main(String[] args)
	
	{
		int arr[]= {5,3,6,7,8,4};
		int length =arr.length;
		int highest=arr[0];
		int secondhighest=arr[0];
		
		for(int i=0;i<length;i++)
		{
			if(highest<arr[i])			
			{
				secondhighest=highest;
				highest=arr[i];
			}
			
			else if(arr[i]>secondhighest && arr[i]!=highest)
			{
				secondhighest=arr[i];
			}
		}
		if(secondhighest==highest)
		{
			System.out.println("There is no Second Highest Num Present");
		}
		else
		{
			System.out.println("The Second Highest Num is : "+secondhighest);
		}
		
	}

}
