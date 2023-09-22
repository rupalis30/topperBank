import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('Y', 1);
		hm.put('O', 2);
		hm.put('G', 5);
		hm.put(null,5);
		hm.put('E',null);
		hm.put('S',null); 
		hm.put(null,10);
		hm.put('Y', 5);
		System.out.println(hm.size());
        System.out.println(hm.get('Y'));
        System.out.println(hm.get(null));
        System.out.println(hm.containsKey('Y'));
        System.out.println(hm.containsKey('Z'));
        
        // for lopp iteration ke liye wese hi hashmap iteration ke liye use krte he.
        //key value print
        
        for(Map.Entry<Character,Integer> hm1 : hm.entrySet()) {
        	System.out.println(hm1.getKey()+ " "+ hm1.getValue());
        }
        
		
		

	}

}
