
public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				System.out.println("prime no "+i);
			}else {
				System.out.println("not prime no "+ i);
			}
		}

	}

}
