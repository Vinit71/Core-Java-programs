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
