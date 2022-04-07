package BasicJava;

public class SumOfDigAndOddEvenInArr {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,41};
		int sum=0;
		int OddCount=0;
		int EvenCount=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]%2==0)
			{
				EvenCount++;
			}
			else
			{
				OddCount++;
			}
			}
			System.out.println("The Sum of the Digits " + sum);
			System.out.println("The Count of Even Number Digits " + EvenCount);
			System.out.println("The Count of Odd Number Digits " + OddCount);
		}
		

	}


