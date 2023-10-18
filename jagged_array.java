class JaggedArr{
    public static void main(String st[]){
        //Declaration
        int jag_arr[][];
        //Memory allocation
        jag_arr = new int[3][];
        jag_arr[0]= new int[]{1,2,3};
        jag_arr[1]= new int[]{4,5};
        jag_arr[2]= new int[]{6,7,8,9};

        //Printing values of jagged array
         for (int i = 0; i < jag_arr.length; i++) {
            for (int j = 0; j < jag_arr[i].length; j++) {
                System.out.print(jag_arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next sub-array
        }    
    }
}

/* --Output--
     123
     45
     6789 
 */

/*
  In Java, a jagged array is an array of arrays, where each sub-array can have a different length, 
  allowing for the creation of non-rectangular arrays.
 */