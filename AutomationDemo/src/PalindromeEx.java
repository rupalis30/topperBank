
public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "SAS";
		// CharAt(index)
		String RevStr = "";
		for (int i = str.length()-1;i>=0;i--) {
		RevStr = RevStr + str.charAt(i);
		}
		if (str.equals(RevStr)) {
		System.out.println("The Given String is Palindorme");
		}else {
		System.out.println("The Gven String is not Palindorme");
		}
	}

}
