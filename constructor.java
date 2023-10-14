class A{
    //Non-parameterized constructor
    A(){
        System.out.println("Hello");
    }
    
    //Parameterized constructor
    A(int x, int y){
        System.out.println(x+y);
    }
}

class Test{
    public static void main(String st[]){
        new A();
        new A(5,10);
    }
}

/*
1. Constructors are used to initialize the state of an object.
2. Constructor have same name as their class name.
3. They do not have a return type.
4. If a class does not explicitly define any constructors, Java provides a default constructor with no parameters.
5. Constructors can be overloaded. 
*/