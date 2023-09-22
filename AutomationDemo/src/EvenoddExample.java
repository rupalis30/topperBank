
public class EvenoddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int b=0;
        for(int i=1;i<=30;i++) {
        	
        	if(i%2==0) {
        		
        		//System.out.println("even no" + i);
        		count++;
        		
        	    
        	}
        	else {
        		b++;
        		//System.out.println("odd no" + i);
        		
        		
        	}
        }
        System.out.println("total even count"+count);
        System.out.println("total odd count"+ b);
        
	}

}
