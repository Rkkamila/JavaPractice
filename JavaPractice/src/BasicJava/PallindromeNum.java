package BasicJava;

import java.util.Scanner;

public class PallindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverese : ");
		int num=sc.nextInt();
		int OrgNum=num;
		int rev_num=0;
		while(num!=0)
		{
		rev_num=rev_num*10+num%10;
		num=num/10;
		}
		if(OrgNum==rev_num)
		{System.out.println("The entered number is a Pallindrome.");}
		else
		{System.out.println("The entered number is not a Pallindrome.");}
	}

}
