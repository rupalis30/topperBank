import java.util.HashMap;
import java.util.Map;

public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     HashMap  m= new HashMap();
     HashMap <Integer,String> m= new HashMap<Integer,String>();
     m.put(101,"ram");
     m.put(102,"sham");
     m.put(103,"sita");
     m.put(104,"gita");
     m.put(105,"mina");
     m.put(103,"sona");
     m.put(106,"mina");
     
     System.out.println(m);     //{101=ram, 102=sham, 103=sona, 104=gita, 105=mina, 106=mina}
     System.out.println(m.get(105));   //mina
     m.remove(106);                       
     System.out.println(m);   //{101=ram, 102=sham, 103=sona, 104=gita, 105=mina}
     System.out.println(m.containsKey(101));   //true
     System.out.println(m.containsValue("sham")); //true
     System.out.println(m.isEmpty()); //false
     System.out.println(m.keySet());  //[101, 102, 103, 104, 105]
     System.out.println(m.values());   //[ram, sham, sona, gita, mina]
     System.out.println(m.entrySet());  //[101=ram, 102=sham, 103=sona, 104=gita, 105=mina]
     
     // read  individual object
     
     for(Object i:m.keySet()) {
    	 System.out.println(i);
    	 //101
    	 //102
    	 //103
    	 //104
    	 //105

     }
     
     for(Object j: m.values()) {
    	 System.out.println(j);
    	 
    	 //ram
    	 //sham
    	// sona
    	// gita
    	// mina
     }
     
     //hashmap method
     
     for(Object i: m.keySet()) {
    	 System.out.println(i+ "   "+ m.get(i));
    	 
    	 //101   ram
    	 //102   sham
    	 //103   sona
    	 //104   gita
    	 //105   mina

     }
     
     //Entry method in map interface
     
     for(Map.Entry<Integer, String> hm : m.entrySet()) {
    	 System.out.println(hm.getKey()+ "  "+ hm.getValue());
    	 
    	//101   ram
    	 //102   sham
    	 //103   sona
    	 //104   gita
    	 //105   mina
     }
     
     
    
     
     
     
	}

}
