
public class Test2 {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	
	//constructor
	
//	Test2(int id,String name, int sal, int dno){
//		
//		empid=id;
//		empname=name;
//		salary=sal;
//		deptno=dno;
//		
//		
//	}
	
	void setData(int id , String name, int sal ,  int dno ) {
		
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
		
		
	}
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         
//		//  using object
//		 	Test2 emp1 = new Test2();
//		 	emp1.empid=101;
//		 	emp1.empname="roop";
//		 	emp1.salary=10000;
//		 	emp1.deptno=10;
//		 	
//		 	emp1.display();
//		 	
		 	
//		 	Test2 emp2 = new Test2();
//		 	emp2.empid=102;
//		 	emp2.empname="rghu";
//		 	emp2.salary=20000;
//		 	emp2.deptno=10;
//		 	
//		 	emp2.display();
		
		
		// using constructor
		
//		Test2 emp1 = new Test2(101,"roop", 10000,10);
//		emp1.display();
//		
//		Test2 emp2 = new Test2(102,"rghu", 20000,20);
//		emp2.display();
//		
		 	
		// assigning value to class variables using method
		
		
		 	
		Test2 emp1 = new Test2();
		emp1.setData(101, "roop", 10000, 10);
		
		emp1.display();
		 	
	}

}
