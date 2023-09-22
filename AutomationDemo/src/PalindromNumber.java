
public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121,c,r,s=0;
		 c=n;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		if(c==s) {
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
