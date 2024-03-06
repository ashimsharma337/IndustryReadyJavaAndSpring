
public class LaunchPattern1 {

	public static void main(String[] args) {
		
	    int n = 7;
	   
	    
//	    for(int i = 0; i < n; i++) {    // innerloop printing * in row (i) and column (j)
//	    	
//	    	for(int j = 0; j < n; j++) {
//	    		System.out.print("*");
//	    	}
//	    	
//	    	System.out.println();
//	    }
	    
	    // Printing star on border
//	    for(int i = 0; i < n; i++) {
//	    	
//	    	for(int j = 0; j < n; j++) {
//	    		
//	    		if(i == 0 || j == 0 || i == n-1 || j == n-1) {
//	    			
//	    			System.out.print("*");
//	    		} else {
//	    			System.out.print(" ");
//	    		}
//	    		
//	    		
//	    	}
//	    	
//	    	System.out.println();
//	    }
	       // Prints A
//	       for(int i = 0; i < n; i++) {
//		    	
//		    	for(int j = 0; j < n; j++) {
//		    		
//		    		if((i == 0 && j > 0 && j < n-1) || (j == 0 && i > 0)  || i == (n-1)/2 || (j == n-1 && i > 0)){
//		    			
//		    			System.out.print("*");
//		    		} else {
//		    			System.out.print(" ");
//		    		}
//		    		
//		    	}
//		    	
//		    	System.out.println();
//		    
//	       }
	       //Telusko
	       for(int i = 0; i < n; i++) {
		    	//T
		    	for(int j = 0; j < n; j++) {
		    		
		    		if(i == 0 || j == (n-1)/2){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	} 
		    	System.out.print("   ");
		    	//E
                for(int j = 0; j < n; j++) {
		    		
		    		if(i == 0 || j == 0 || i == (n-1)/2 || i == n-1){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	}
                System.out.print("   ");
                //L
                for(int j = 0; j < n; j++) {
		    		
		    		if(j == 0 || i == n-1){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	}
                System.out.print("   ");
                //U
                for(int j = 0; j < n; j++) {
		    		
		    		if((j == 0 && i < n-1) || (j == n-1 && i < n-1) || (i == n-1 && j < n-1 && j > 0)){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	}
                System.out.print("   ");
                //S
                for(int j = 0; j < n; j++) {
		    		
		    		if((i == 0 && j > 0)  || (j == 0 && i < (n-1)/2 && i > 0) || (i == (n-1)/2 && j > 0 && j < n-1) || (j == n-1 && i > (n-1)/2 && i < n-1) || (i == n-1 && j < n-1)){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    
		        }
                System.out.print("   ");
                //K
                for(int j = 0; j < n; j++) {
		    		
		    		if(j == 0 || (i+j) == 3 || (i-j == (n-1)/2)  ){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	} 
                System.out.print("   ");
                //O
                for(int j = 0; j < n; j++) {
		    		
		    		if((i == 0 && j > 0 && j < n-1) || (j == 0 && i > 0 && i < n-1) || (i == n-1 && j > 0 && j < n-1) || (j == n-1 && i > 0 && i < n-1) ){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    		
		    	}
                
                
                
		    	
		    	System.out.println();
		    
	       }
	       System.out.println("   ");
	       System.out.println("===========================================================================");
	       System.out.println("   ");
	       
	       for(int i = 0; i < n; i++) {
		   //A	
		   for(int j = 0; j < n; j++) {
		    		
		    		if((i == 0 && j > 0 && j < n-1) || (j == 0 && i > 0)  || i == (n-1)/2 || (j == n-1 && i > 0)){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    
		    }
		    	
		    System.out.print("   ");
		    //S
            for(int j = 0; j < n; j++) {
		    		
		    		if((i == 0 && j > 0)  || (j == 0 && i < (n-1)/2 && i > 0) || (i == (n-1)/2 && j > 0 && j < n-1) || (j == n-1 && i > (n-1)/2 && i < n-1) || (i == n-1 && j < n-1)){
		    			
		    			System.out.print("*");
		    		} else {
		    			System.out.print(" ");
		    		}
		    
		    }
            
            System.out.print("   ");
            //H
            for(int j = 0; j < n; j++) {
	    		
	    		if(j == 0 || i == (n-1)/2 || j == n-1){
	    			
	    			System.out.print("*");
	    		} else {
	    			System.out.print(" ");
	    		}
	    
	        }
            System.out.print("   ");
            //I
            for(int j = 0; j < n; j++) {
	    		
	    		if(i == 0 || j == (n-1)/2 || i == n-1 ){
	    			
	    			System.out.print("*");
	    		} else {
	    			System.out.print(" ");
	    		}
	    
	        }
            System.out.print("   ");
            //M
            for(int j = 0; j < n; j++) {
	    		
	    		if(j == 0 || (i == j && i <= (n-1)/2) || ((i+j) == n-1 && i <= (n-1)/2) || j == n-1 ){
	    			
	    			System.out.print("*");
	    		} else {
	    			System.out.print(" ");
	    		}
	    
	        }
		    	
		    	System.out.println();
		    
	       }
	       System.out.println(" ");
           System.out.println("==================================================================================");
           System.out.println(" ");
	       
           // TO DO : Some Pattern
	}

}
