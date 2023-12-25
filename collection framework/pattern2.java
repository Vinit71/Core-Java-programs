import java.util.Scanner;
class Pattern2{
    public static void main(String st[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Logic
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}