import java.util.Scanner;

public class Biggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* int a=40;
      int b=30;
      if(a>b) {
    	  System.out.println("a is greater");
      }else {
    	  System.out.println("b is greater");
      }*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(" a is big ");
		}else {
			System.out.println(" b is big ");
		}
		
		
	}
	

}
