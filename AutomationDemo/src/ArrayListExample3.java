import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		
	al.add(10);
	al.add(23);
	al.add(30);
	al.add(45);
	System.out.println(al);
	int siz = al.size();
	//System.out.println(al.size());
	System.out.println(siz);
	al.add(2,500);
	System.out.println(al);
	System.out.println(al.size());
	int x=al.get(4);
	System.out.println(x);
		
	}

}
