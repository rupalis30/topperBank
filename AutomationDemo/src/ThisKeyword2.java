

 class ThisKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A r=new A(100);
      r.show();
	}

}
class A{
	int a;
	A(int a){
		this.a=a;
		
	}
	void show() {
		System.out.println(a);
	}
}