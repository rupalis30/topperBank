import java.util.ArrayList;

public class ArrayListExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// remove duplicate data in array.
		
		int a[]= {1,2,3,1,4,5,6,8,7,8};
		ArrayList<Integer> al  = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(al.contains(a[i])) {
				
			}else {
				al.add(a[i]);
			}
		}
		
		//jhzgsf++++
			//nbdn +++++++++++
		System.out.println(al);
	}

}
