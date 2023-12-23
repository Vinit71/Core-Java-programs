import java.util.Scanner;
class StackOperations{
    int pointer=-1,value;

        //to insert a value in the stack
        void push(int arr[],int size){
            if(pointer>size-1){
                System.out.println("Overflow");
            }
            else{
                System.out.println("Enter a value to push: ");
                Scanner input = new Scanner(System.in);
                value = input.nextInt();
                pointer++;
                arr[pointer]=value;
            }
        }

        //to delete a value from stack
        void pop(int arr[], int size){
            if(pointer<0){
                System.out.println("Empty stack");
            }
            else{
                System.out.println(arr[pointer]+"is deleted");
                pointer--;
            }
        }

        //display stack 
        void display(int arr[],int size){
            if(pointer==-1){
                System.out.println("Stack is empty");
            }
            else{
            for(int i=0; i<=pointer; i++){
                System.out.println(arr[i]);
            }
        }
        }
}
class StackInJava{
    public static void main(String st[]){
        int size = 5,choice;
        boolean exit = false;
        Scanner ch = new Scanner(System.in);
        int array1[] = new int[size];
        StackOperations feat = new StackOperations();
        
        while(exit!=true){
            System.out.print("Enter your choice: ");
            choice = ch.nextInt();
        switch (choice) {
            case 1:
                feat.push(array1, size);
            break;
        
            case 2:
                feat.pop(array1, size);
                break;
        
            case 3:
                feat.display(array1, size);
                break;
        
            case 4:
                exit = true;
                break;
        }
    }
    } 
}