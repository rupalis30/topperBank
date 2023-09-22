package programpractice;

public class Practice9 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {  //line
            for(int j=(10-1);j>=i;j--) {     //space
            	System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {      //start 
            	System.out.print("*");
            }
            System.out.println();    //next line
		}

	}

}


//         *
//        **
//       ***
//      ****
//     *****
//    ******
//   *******