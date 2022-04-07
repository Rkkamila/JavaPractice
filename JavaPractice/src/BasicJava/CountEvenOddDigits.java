package BasicJava;

public class CountEvenOddDigits {

	public static void main(String[] args) 
	{
		int num=23;
		int OddCount=0;
		int EvenCount=0;
		while(num!=0)
		{		
		
		if(num%2==0)
		{
			EvenCount++;
		}
		else
		{
			OddCount++;	
		}
		num=num/10;
		}
		
	System.out.println("The Odd Digits in the Number is "+OddCount);
	System.out.println("The Even Digits in the Number is "+EvenCount);

}

}
