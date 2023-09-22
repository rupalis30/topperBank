
public class ThisKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    A r=new A();
    System.out.println(r);
    r.show();
	}

}
class  A {
	void show() {
		System.out.println(this);
	}
}