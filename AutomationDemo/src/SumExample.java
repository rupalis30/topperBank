
public class SumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0;
     int count=0;
     for(int i=2;i<=50;i=i+2) {
    	 if(count%2==0) {
    		 sum = sum+1;
    	 }else {
    		 sum=sum-1;
    	 }
    	   count=count+1;
     }
     System.out .println(sum);
  
    
	}

}
