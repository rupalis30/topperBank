
 class FinalKeyword3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Check f = new  Check();
         f.number();
         f.atmPin();
	}

}
 
final class Pass{
	void number() {
		System.out.println("9876543210");
	}
	
	void atmPin() {
		System.out.println("4567");
	}
}

class Check extends Pass{
	void number() {
		System.out.println("9876543210");
	}
	
	void atmPin() {
		System.out.println("4567");
	}
}
