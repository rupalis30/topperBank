
class Data {
    String name;
    int age;
    
    public void printInfo() {
    	System.out.println(this.name);
    	System.out.println(this.age);

    }


public class Pen{
	public static void main(String args[]) {
		
		Data s1= new Data();
		
		s1.name="roop";
		s1.age=32;
		s1.printInfo();
	}
	 
}
}
