import java.util.ArrayList;

public class ArrayListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	// unique data 	
 ArrayList<String>x=new ArrayList<String>();
		
		x.add("Roop");
		x.add("deep");
		x.add("sonu");
		x.add("Roop");
		x.add("Roop");
		
		
		
		
		ArrayList<String>y=new ArrayList<String>();
		y.add("Roop");
		y.add("raj");
		y.add("mahi");
		y.add("rghu");
		y.add("savik");
		y.add("naik");
		
ArrayList<String>z=new ArrayList<String>();
		
		for(int i=0; i<x.size();i++) {
			if(z.contains(x.get(i))){
				
			}else {
				z.add(x.get(i));
			}
		}
		for(int i=0; i<y.size();i++) {
			if(z.contains(y.get(i))){
				
			}else {
				z.add(y.get(i));
			}
		}
		
		
		System.out.println(z);
		
	}

}
