import java.util.*;
public class twoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int number[]=new int[size];
        //input
        for(int i=0; i<size; i++){
            number[i]= sc.nextInt();
        }
        //output
        for(int i=0; i<size; i++){
         System.out.println(number[i]);
        }
	}

}
