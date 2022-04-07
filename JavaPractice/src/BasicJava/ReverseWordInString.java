package BasicJava;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  sr ="My India is Beautiful";
		String Rev[]=sr.split(" ");
		int len =Rev.length;
		
		
		for(int i=len-1;i>=0;i--)
		{
		
			System.out.print(Rev[i]+" ");
		}
		

	}

}
