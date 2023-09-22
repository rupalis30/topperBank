
public class PrimeNumberExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a=11,count=0;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				count++; // 	
			}
		}
		System.out.println(count);
		if(count<=0) {
			System.out.println("a is prime");
		}else {
			System.out.println("a is not prime");
		}
	
	}

}


// divide by 1 and divide itself. it is prime number.