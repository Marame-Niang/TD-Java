
public class EXO23 {
	public static void main(String[] args) {
		
	final int  milliard = 1000000000;
	int m, M, FN, i, estimation;
	int N = 12;
	m = 2 ;                   
    FN = m;
    M = 0 ;
    
    for (i = 1; i <= N; i++) {
    	if(i == 1) {
        	M = 2;               
            FN = M;
        }
    	
    	else {
    		FN = M + m;              
    		m = M ;   
    		M = FN ;   
        
    	}

    }
    
    System.out.printf("le nombre de lapins au bout de " + N + " mois est : " + FN + "\n") ;   
                               
    while (FN <= milliard) {
    	N++;                   
        FN = M + m;                    
        m = M ;        
        M = FN ;

    }
    
    System.out.printf("le nombre dépasse " + milliard + " au bout de " + N +" mois");
    
	}
}
