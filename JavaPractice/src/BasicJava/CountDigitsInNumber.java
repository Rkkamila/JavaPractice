package BasicJava;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to count the digits  : ");
		int num=sc.nextInt();
		int EntNum=num;

		int count=0;
		while(num!=0)
		{
		
		num=num/10;
		count++;
		}
		System.out.println("The Entered Number is "+""+EntNum);
		System.out.println("The Total Digits in the entered Number is " + count);

	}

}
