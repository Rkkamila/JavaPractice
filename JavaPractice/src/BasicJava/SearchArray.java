package BasicJava;

public class SearchArray {

	public static void main(String[] args) {
	
		int arr[]= {100,200,30,401};
		int searchEle=301;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchEle)
			{
				System.out.println("Match Found");
				flag=true;
				break;
			}
		}
			if(flag==false)
				
			{
				System.out.println("Match Not Found");
			}
			
		
		

	}

}
