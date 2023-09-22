
 class FinalKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thief f = new  Thief();
         f.number();
         f.atmPin();
	}

}
 
 class Test{
	 void number() {
		 System.out.println("9876543210");
	 }
	final void atmPin() {
		 System.out.println("4567");
		 
	 }
 }
 class Thief extends Test{
	 void number() {
		 System.out.println("9876543210");
	 }
	 void atmPin() {
		 System.out.println("4567");
		 
	 }
 }
