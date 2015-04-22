
public class TestTriangle {
	
	public static String validtrianglesum(String input1) {
        String[] inputArray = input1.split("#") ;
        String invalid = "Invalid" ;
        if( isValidTriangle(inputArray.length) < 0 ) {
        	return invalid;
        }
        long rowCount = 1 ;
        long sum = 0l ;
        long rowMax = 0l;
        
		for(int i=0; i < inputArray.length -1; rowCount++) {
			rowMax = 0l;			
			for(int j = 0; (j < rowCount) && (i < inputArray.length -1); i++, j++) {
				try {
					long tmp = Long.parseLong(inputArray[i]);
					
					if(tmp > rowMax) {
						rowMax = tmp ;
					}
						
				} catch (NumberFormatException e) {
					return invalid;
				}
			}
						
			sum = sum + rowMax ;
			
		}
		
		return ""+sum;
    }

	private static int isValidTriangle(int numberCount) {
		for(int i = 1; i < (numberCount / 2) +1 ; i++) {
			if( ((i*i) + i) == 2*numberCount ) {
				return i ;
			}
		}
		return -1;
	}
	
}
