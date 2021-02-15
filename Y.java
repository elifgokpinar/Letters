
public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size1=15;
        
        for(int i =0 ; i<(size1+1)/2 ; i++) {
        	for(int j =0 ; j<size1; j++) {
        		if(j==i || j==size1-i-1)
        		System.out.print("*");
				
    			else 
    			System.out.print(" ");
    			
        	}
        	System.out.println();
        }
       for(int k =0; k<(size1-1)/2; k++) {
    	   for(int m=0; m<=(size1+1)/2; m++ ) {
    		   if( m==(size1+1)/2-1)
    			   System.out.print("*");
    	   
    		   else 
       			System.out.print(" ");
       }
    	   System.out.println();
	}
}
}
