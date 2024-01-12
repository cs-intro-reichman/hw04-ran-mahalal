;public class ArrayOps {
    public static void main(String[] args) {
     
     System.out.println(isSorted(new int [] {1, 3, 2}));   
    }
    
    public static int findMissingInt (int [] array) {
        int index = 0;
        int none =0;
       	if (array.length == 1 && array[0] == 0) {
       		return 1;
       	}
       	if (array.length == 1 && array[0] == 1) {
       		return 0;
       	}

       	for (int i = 0; index < array.length; i++ ) {
       		if (index == array[i]) {
       			index++;
       			i = 0;
       		}

       		if (i == (array.length - 1)) {
       			return index;
       		}
       	}

       	return none;

       
    }        
       
        
     
    public static int secondMaxValue(int [] array) {
        int max = Math.max(array[0], array[1]);
        int submax = Math.min(array[0], array[1]);
        if(array.length == 2) {
        	return submax;
        }
        for(int i = 2; i < array.length; i++) {
        	if (array[i] >= max) {
        			submax = max; 
        			max = array[i];		
        		
        	}
        	else if (array[i] >= submax) {
        		submax = array[i];
        	}
        }
        return submax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int found = 0;
        int found1 = 0;
        for (int i = 0; i < array1.length; i++) {
        	for (int j = 0; j < array2.length; j++) {
        		if (array1[i] == array2[j]) {
        			found++;

        		}
        	}
        	if (found == 0){
        		return false;
        	}
        	found = 0;
        }

        for (int i = 0; i < array2.length; i++) {
        	for (int j = 0; j < array1.length; j++) {
        		if (array2[i] == array1[j]) {
        			found1++;

        		}
        	}
        	if (found1 == 0){
        		return false;
        	}
        	found1 = 0;
        }
        
        	return true;
        
    }

    public static boolean isSorted(int [] array) {
        boolean ordered1 = true;
        boolean ordered2 = true;
        int incr = 0;
        int notincr = 0;
        int decr = 0;
        int notdecr = 0;
      
        for (int i = 1; i < array.length; i++ ) {
        	if (array[i] <= array[i -1]) { 
       			decr = 0;;
       		} else {
       			notdecr++;
       		}
       	}
    	   
  	   
       	for (int i = 1; i < array.length; i++ ) {
        	if (array[i] >= array[i -1]) { 
        		incr = 0;;
       		} else {
       			notincr++;
       		}
        }
        
        if (notdecr == 0 || notincr == 0){
        	return true;
        } else {
        	return false	;
        }
    }

}
