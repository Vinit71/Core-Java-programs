import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UserInput {
    public static void main(String st[]){
        System.out.println("Enter your name: ");
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String user_name = input.readLine(); 
            System.out.print("Hello "+user_name);
        }
        catch(IOException io){
            System.out.print("There is an exception");
        }
    }
}
