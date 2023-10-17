class Excep{
    public static void main(String st[]){

        //try block has code which might give an exception
        try{
        System.out.print(st[0]);
        }

        //excecute only if there is an exception of type ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e){   
        System.out.print("There is ArrayIndexOutOfBoundsException");
        }
}
}

//Exceptions in Java are runtime errors or unexpected conditions that disrupt the normal flow of a program and can be caught and handled using try-catch blocks.

/*  --Try block--
  *  Try block is used when the program scans some instruction which can occur exception.
  *  Try can't be used alone, It will always be used either with catch fuction or with finally block.
*/

/* --Catch function--
  *  It's used with try block
  *  Every catch function will havae one argument and that is of an exception type class.
  *  We can use multiple catch functions with one try block.
*/