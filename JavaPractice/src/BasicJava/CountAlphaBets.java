package BasicJava;

public class CountAlphaBets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDabcd1234!@#$";
		String UppperList="";
		String LowerList="";
        int upper = 0, lower = 0, number = 0, special = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
            	UppperList=UppperList+str.charAt(i);
                upper++;
            }
            else if (ch >= 'a' && ch <= 'z')
            {
            	LowerList=LowerList+str.charAt(i);
                lower++;
            }
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
 
        System.out.println("Lower case in the string : " + lower);
        System.out.println("Upper case in the string : " + upper);
        System.out.println("Number in the string : " + number);
        System.out.println("Special characters : " + special);
        System.out.println("The List of Small Alphabets : "+LowerList);
        System.out.println("The List of Capital Alphabets : "+UppperList);


	}

}
