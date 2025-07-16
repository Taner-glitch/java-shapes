package kapsülleme;

public class takilmaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 *  *    *****   *
		 *  **    ****   ** 
		 *  ***    ***   ***
		 *  ****    **   ****
		 *  *****    *   *****
		 *  
		 *  *    *
		 *   *  *  
		 *     *
		 *   *  *
		 *  *    *
		 */
		
		for (int i=1; 5>=i; i++) {
			for(int j=1; i>=j; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i=5; i>=0; i--) {
			for(int j=1; i>=j; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		 int height = 5;

	        for (int row = 1; row <= height; row++) {
	            
	            for (int i = 1; i <= row; i++) {
	                System.out.print("*");
	            }

	            System.out.print("   "); 

	            
	            for (int i = height; i >= row; i--) {
	                System.out.print("*");
	            }

	            System.out.print("   "); 

	            
	            for (int i = 1; i <= row; i++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	        
	        int size = 5;
	        
	        for(int i=0; i<size; i++ ) {
	        	for(int j=0; j<size; j++) {
	        		if(j==i || j==size-i-1 ) {
	        			System.out.print('*');
	        		}
	        		else {
	        			System.out.print(' ');
	        		}
	        	}
	        	System.out.println();
	        	
	        }
		

		}

	}



