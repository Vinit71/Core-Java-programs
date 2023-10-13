class Sup{
    void display(){
        System.out.print("Hello from Super class");
    }
}

class Sub extends Sup{
    void display(){
        System.out.print("Hello from Sub class");
    }
    public static void main(String st[]){
        
        Sup obj1 = new Sub();   //Super class reference variable refer to sub class object
        
        obj1.display();
    }
}

/*Dynamic Method Dispatch
 1. Method Resolution at Runtime
 2. Involves Inheritance and Overriding
 3. Enables Polymorphism
 4. Supports Method Overloading
 */