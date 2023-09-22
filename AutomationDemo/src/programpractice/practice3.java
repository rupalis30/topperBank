package programpractice;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      int count=0;
      String s="Rupali";
      for(int i=0;i<s.length();i++) 
      {
    	  if(s.charAt(i)>='a' && s.charAt(i)<='z') 
    	  {
    		  count++;
    	  }
      }
      System.out.println(count);
		
	}

}
