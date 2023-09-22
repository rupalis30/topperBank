import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>x= new ArrayList<String>();
		
		x.add("Z");
		x.add("A");
		x.add("D");
		x.add("P");
		x.add("Q");
		x.add("Q");
	
		/*System.out.println(x);
		Collections.sort(x);
		System.out.println(x);*/
		
		//to print listby using for loop
		
      /*for(int i= 0;i<x.size();i++) {
    	  System.out.print(" "+x.get(i));*/
		for(int i=0; i<x.size();i++) {
			System.out.println(x.get(i));
      }
 
	}

	
	
	
	
}
