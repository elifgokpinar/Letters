//Elif Gökpınar - Grade 1
public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int size1=11;
		for (int i = 0 ; i<size1 ; i++) {
		  for(int j =0; j<=(size1*4)-3; j++) {
			if(i!=0 && i!=size1-1)
			  if(i==j || j==(size1*2)-2-i || j==(size1*4)-4-i || j==(size1*2)+i-2)
					System.out.print("*") ;
					
				else 
				System.out.print(" ");
				
			if(i==0)
				if(i==j || j==(size1*4)-4-i || j==(size1*2)+i-2)
					System.out.print("*") ;
					
				else 
				System.out.print(" ");
			if(i==size1-1)
				if(j==(size1*2)-i-2 || j==(size1*4)-4-i )
				System.out.print("*") ;
			
				else 
				System.out.print(" ");		
		  }
		System.out.println();		
	  }	  
	  }
		}
