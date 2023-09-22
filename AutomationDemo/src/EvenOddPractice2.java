
public class EvenOddPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenCount=0;
		int oddCount=0;
      for(int i=0;i<=100;i++) {
    	  if(i%2==0) {
    		  evenCount++;
    		  System.out.println("even no"+i);
    	  }else {
    		  oddCount++;
    		  System.out.println("odd no" + i);
    		  
    	  }
      }
      System.out.println("evenCount" + evenCount);
      System.out.println("oddCount" +oddCount);
      
	}

}
