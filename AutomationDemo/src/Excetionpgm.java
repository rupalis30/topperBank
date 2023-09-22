
public class Excetionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		int data=10/0;  // arithmatic exception
//		System.out.println("data");
		
//		String s= null; // NullPointerException.
//		System.out.println(s.length());
		System.out.println("hi before");
		//B b = new B();
		//b.Display();
		System.out.println("hi after");
		
	}
	
	class B {
		//println()
		String Display() {
			try {
				int a = 5;
				int c= 5/0;
				return "true";
			}catch (Exception e) {
				return "false";
			}	
			
			
		}
	}

}
