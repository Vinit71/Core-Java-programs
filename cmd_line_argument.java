class CmdLine{
    public static void main(String st[]){
        System.out.print("Entered argument: ");
        System.out.print(st[0]);
    }
}

/* Command-line arguments are passed to a Java program as an array of strings.
 * Command-line arguments are provided by the user when the Java program is executed from the command line or terminal.
 * Program will throw an 'ArrayIndexOutOfBoundsException' if no argument is entered by the user.
 */