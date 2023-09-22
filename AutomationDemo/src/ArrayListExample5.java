import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ArrayList<String>x=new ArrayList<String>();
		
		x.add("Roop");
		x.add("deep");
		x.add("sonu");
		
		
		ArrayList<String>y=new ArrayList<String>();
		
		for(int i=0; i<x.size();i++) {
			if(y.contains(x.get(i))){
				
			}else {
				y.add(x.get(i));
			}
		}
		System.out.println(y);

	}

}
