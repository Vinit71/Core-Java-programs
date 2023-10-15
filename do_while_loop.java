class DoNumbers{
    public static void main(String[] args) {
        int number = 7;
        
        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
    }
}

/* The do-while loop in Java ensures that the loop's body is executed at least once,
 regardless of whether the loop condition is initially true or false. */

 /* --Output--
        7
  */