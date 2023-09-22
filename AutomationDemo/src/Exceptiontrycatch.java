
public class Exceptiontrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10, b=0,c;
//		try {
//			c=a/b;
//			System.out.println();	
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		String str="roop";
		try {
			int a= Integer.parseInt(str);
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("cant converted in integer");
		}
			
	}

}
