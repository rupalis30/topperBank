
public class StringUpperPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s= "Rupali";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
