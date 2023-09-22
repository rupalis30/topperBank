import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner (System.in);
  System.out.println("enter marks");
  int marks= sc.nextInt();
  if(marks>=60 && marks<=100) {
	  System.out.println("grade A");
  }else if(marks>=50 && marks<=59) {
	  System.out.println("grade B");
  }else if(marks>=40 && marks<=49) {
	  System.out.println("grade c");
  }else {
	  System.out.println("fail");
  }
	}

}
