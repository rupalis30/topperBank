package programpractice;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowercount=0;
		int uppercount=0;
		String s= "RupaliAAAbbbSSXXZZ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println("lowercase letter  " + s.charAt(i));
				lowercount++;
				
			}
			
			else
			{
				System.out.println("uppercase letter  " + s.charAt(i));
				uppercount++;
			}
		}
		System.out.println(lowercount);
		System.out.println(uppercount);

	}

}
