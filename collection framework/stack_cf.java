import java.util.Stack;

class LearnStack{
    public static void main(String args[]){
    Stack<String> animals = new Stack<>();
    
    //to push element in the stack
    animals.push("Rat");
    animals.push("Cat");
    animals.push("Dog");
    System.out.println(animals);

    //to pop 
    animals.pop();

    //to see top most element in the stack
    System.out.println(animals.peek());


    }

}
