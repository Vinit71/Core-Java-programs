interface Details{
    void displayName();
    void printale();
}

class Main implements Details{
    public void displayName(){
        System.out.println("Name: Vinit Kumar");
    }
    public void printale(){
        System.out.println("Printing a random text");
    }

    public static void main(String st[]){
        Main obj = new Main();
        obj.displayName();
        obj.printale();
    }
} 

/*
 1. All methods in interfaces are implicitly public and abstract.
 2. Multiple Inheritance: Interfaces in Java support multiple inheritanc.
 3. Used for Abstraction and API Design.
 */