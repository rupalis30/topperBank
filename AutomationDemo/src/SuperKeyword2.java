 class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B r = new B();
      r.show();
	}
	
	

}
 
 class A {
	 void show() {
			
		 System.out.println("hello viewer");
		 
	 }
	 
 }
 class B extends A{
	 
	 void show() {
		super.show();
		 System.out.println("hello learner");
		 
	 }
 }
