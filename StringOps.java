public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    
   		
    
    }

    public static String capVowelsLowRest (String string) {
        char [] array = new char[string.length()]; // Creats a char array, with the String's characters.
        for (int i = 0; i < string.length(); i++) {
        	array[i] = string.charAt(i);
        }

        for (int j = 0; j < array.length; j++) {
        	if ((array[j] == 'a') || (array[j] == 'e') || (array[j] == 'i') || (array[j] == 'o') || (array[j] == 'u')) {
        		array[j] = (char) (array[j] - 32);
        	}
        	
        	if ((array[j] >= 65) && (array[j] <= 90) && (array[j] != 'A') && (array[j] != 'E') && (array[j] != 'I') && (array[j] != 'O') && (array[j] != 'U')){
        		array[j] = (char) (array[j] + 32);
        	}
        }
        String fixed = "";

        	
        for (int k = 0; k < array.length; k++) {
        	fixed = fixed + array[k];
        
        }
        
        return fixed;
    }

    public static String camelCase (String string) {
        String corrected = "";
        char [] array = new char[string.length()]; // Creats a char array, with the String's characters.
        for (int i = 0; i < string.length(); i++) {
        	array[i] = string.charAt(i);
        }

        if ((array[0] != ' ') && (array[0] >= 65) && (array[0] <= 90)) {
        			array[0] = (char) (array [0] + 32);
        			corrected = (corrected + array[0]);
        } else if ((array[0] != ' ') && (array[0] > 90)) {
     		corrected = (corrected + array[0]);
        }

        	        
        for (int j = 1; j < string.length(); j++) {
        	if (array[j] != ' ') {
        		if ((array[j-1] != ' ') && (array[j] >= 65) && (array[j] <= 90)) {
        			array[j] = (char) (array [j] + 32);
        			corrected = (corrected + array[j]);
        		}
				else if ((array[j-1] != ' ') && (array[j] > 90)) {
       				corrected = (corrected + array[j]); 
       			}

       			if ((array[j-1] == ' ') && (array[j] >= 65) && (array[j] <= 90)) {
       				corrected = (corrected + array[j]); 
       			}
       			else if ((array[j-1] == ' ') && (array[j] > 90)) {
       				array[j] = (char) (array [j] - 32);
       				corrected = (corrected + array[j]); 
       			}
        	}
        }

        String corrected2 = "";
        if ((array[0] >= 65) && (array [0] <= 90)) {
        	corrected2 = ((char) (corrected.charAt(0) + 32) + corrected.substring(1, corrected.length())); 
        } else if (array[0] > 90) {
        	corrected2 = (corrected.charAt(0) + corrected.substring(1, corrected.length())); 
        } else if ((array[0] == ' ') && (corrected.charAt(0) > 90)) {
        	corrected2 = corrected;
        } else if ((array[0] == ' ') && (corrected.charAt(0) >= 65) && (corrected.charAt(0) <= 90)) {
        	corrected2 = ((char) (corrected.charAt(0) + 32) + corrected.substring(1, corrected.length()));
        }


        return corrected2;
    }

    public static int[] allIndexOf (String string, char chr) {
        int indexCount = 0;

        for (int i = 0; i < string.length(); i++) {
        	if (string.charAt(i) == chr) {
        		indexCount++;
        	}
        }

        int loc = 0;
        int [] allIndexOf1 = new int [indexCount];
        for (int i =0; i < string.length(); i++ ) {
        	if (string.charAt(i) == chr) {
        		allIndexOf1[loc] = i;
        		loc++;
        	}
        }
        return allIndexOf1;
    }
}
