
public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a[]= {2,4,5,7,8,9,4,8,4};
		int evencounter=0;
		int oddcounter=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencounter=evencounter+1;
				
			}else {
				oddcounter=oddcounter+1;
			}
			
		}
		System.out.println( "even count "+ evencounter);
		System.out.println( "odd count "+ oddcounter);
		
		
	}

}
