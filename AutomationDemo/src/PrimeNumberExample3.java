
public class PrimeNumberExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=100;i++) {
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					
					
					count++; // if count value>0 then not prime no;
				
				}
				
			}
		System.out.println(i);
	}
		
	}
}
