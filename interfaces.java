interface Pr{
    void displayName();
    void printale();
}

class InterMain implements Pr{
    public void displayName(){
        System.out.println("Name: Vinit Kumar");
    }
    public void printale(){
        System.out.println("Printing a random text");
    }

    public static void main(String st[]){
        InterMain obj = new InterMain();
        obj.displayName();
        obj.printale();
    }
} 

/*
 1. All methods in interfaces are implicitly public and abstract.
 2. Multiple Inheritance: Interfaces in Java support multiple inheritanc.
 3. Used for Abstraction and API Design.
 */