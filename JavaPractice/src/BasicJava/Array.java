package BasicJava;

public class Array {

	public static void main(String[] args) {

		int arr[]= {100,200,30,40};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		for(int value:arr)
		{
			System.out.println(value);
		}

	}

}
