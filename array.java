class  ArrExample{
    public static void main(String st[]){
    //Step 1: Declaring an Array
        int numbers[];
    //Memory allocation
        numbers = new int[5]; //by default the value stored in array are zero.
    //Assign valutes to the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
    //Accessing
    for(int i=0; i<numbers.length; i++){
        System.out.println(numbers[i]);
    }
    }
}

/* Array allows us to store multiple elements under one name.
 * In java the arrays are dynamic and continuous.
 * While declaring the array in java we can't not give the size of the array.
 */