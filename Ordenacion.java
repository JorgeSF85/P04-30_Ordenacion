package Ordenación;

public class Ordenacion {    
	public static String ordenacion(int n1, int n2, int n3)
	{
		if(n1>n2 && n2>n3) {
			
			return n1+", "+n2+", "+n3; 
		}
		
		else{            
		if(n1>n3 && n3>n2) {
			return n1+", "+n3+", "+n2;
	
		}
			
        else{              
        if(n2>n1 && n1>n3) {
        	return n2+", "+n1+", "+n3;

        }
        
        else{
        if(n2>n3 && n3>n1) {
        	return n2+", "+n3+", "+n1;
        	
        }
        
        else{
        if(n3>n1 && n1>n2) {
        	return n3+", "+n1+", "+n2 ;
        	
        }
        
        else{                
        if(n3>n2 && n2>n1) {
        	return n3+", "+n2+", "+n1;
        	
        }
            				}                
            			}        
            		}    
            	}     
			}
		return n3;
		}
	}
