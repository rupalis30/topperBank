
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =  "My name is Rupali";
		//String str="123abc45def";
		String rev="";
		for (int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(rev);

	}

}
