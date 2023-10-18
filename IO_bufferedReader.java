/*In java I/O classes are divided into two catagories. 
 1. Byte oriented classes
 2. Character oriented classes
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UserInput {
    public static void main(String st[]){
        System.out.println("Enter your name: ");
        
        try{
            //BufferedReader is a 'character-oriented' class.
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String user_name = input.readLine(); 
            System.out.print("Hello "+user_name);
        }
        catch(IOException io){
            System.out.print("There is an exception");
        }
    }
}

/*  
 * BufferedReader is a Java class that reads text from a character-input stream, 
   providing buffering for efficient reading of characters, arrays, and lines from a source.

 * Error Handling: Exception handling allows you to handle errors gracefully. When you read data using BufferedReader, 
   various errors can occur, such as file not found, insufficient permissions, or unexpected end of file.
*/
