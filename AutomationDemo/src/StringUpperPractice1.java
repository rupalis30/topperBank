
public class StringUpperPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s= "Rupali";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=99) {
				count++;
			}
		}
		System.out.println(count);
	}

}
