
public class StringUpperLowerPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Rupali";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println("lowercase"+ " " +s.charAt(i));
			}else {
				System.out.println("uppercase" + " " + s.charAt(i));
			}
		}

	}

}
