
public class PrimeNoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a=11;
		int count=0;
		for(int i=2; i<a ; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count<=0) {
			System.out.println("prime no");
		}else {
			System.out.println("not prime no");
		}
	}

}
