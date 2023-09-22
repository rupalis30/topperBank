import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare arrayList
		 // khali dile ahhe ya type ne aapn delare kru shkto
		//ArrayList x= new ArrayList(); // hetrogeneous data 
		//ArrayList<Integer>x= new ArrayList<Integer>();//homogeneous data

		//ArrayList<String>x= new ArrayList<String>();
		
		//List al = new ArrayList(); 
		
		
		ArrayList al = new ArrayList(); 
		
		// add new elements
		
		al.add(100);
		al.add("welcome");
		al.add("A");
		al.add(15.2);
		al.add(true);
		
		System.out.println(al); //[100, welcome, A, 15.2, true]
		
		//size();
		
		System.out.println("no of element in size " + al.size()); //no of element in size 5
		
		
		
		//remove();
		
		//al.remove(index);
		
		al.remove(1);  // or pass index
		//al.remove("welcome"); // direct pass object
		
		System.out.println("after remove welcome " + al.size()); //after remove welcome 4
		System.out.println(al); //[100, A, 15.2, true]
		
		// insert new element in middle of list
		//add(index, object)
		
		al.add(2,"Rupali");
		
		System.out.println("after add Rupali " + al); //after add Rupali [100, A, Rupali, 15.2, true]
		
		//retrive specific elememt
		al.get(2);
		System.out.println(al.get(2)); //Rupali
		
		//replace element
		
		al.set(2, "Raghu");
		System.out.println("replace with rupali "+ al);
		
		//search value in array list
		// returns true or false.	
		al.contains(al) ;
		
		System.out.println("search this element "+ al.contains("Raghu"));
		
		System.out.println("search this element "+ al.contains("Roopu"));
		
		// list empty or not 
		System.out.println(al.isEmpty());
		
		//Read all the value / object of array list.
		// means itearte whole element in arraylist.
		//for loop
		//for each
		//iterator() method.
		
		System.out.println("Reading element using for loop");
		
		for( int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
		// for each
		
		/*System.out.println("Reading element using for each loop  " );
		for(Object e : al ) {
			
			
			System.out.println(e);
			
		}*/
		
		/*System.out.println("Reading element using for iterator  " );
		  
		
		Iterator  it= al.iterator(); 
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}*/
	}

}
