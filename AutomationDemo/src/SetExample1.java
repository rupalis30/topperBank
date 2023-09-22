import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(null);
		al.add(null);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		System.out.println(al);
		
		Set <Integer> st = new HashSet<Integer>();
		st.add(null);
		st.add(null);
		st.add(1);
		st.add(1);
		st.add(2);
		st.add(2);
		st.add(3);
		System.out.println(st);

	}

}
