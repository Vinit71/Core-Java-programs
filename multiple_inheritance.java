//First interface
interface Father {
    void method1();
}

//Second interface
interface Mother {
    void method2();
}

// Child class implementing both Father and Mother interfaces
class Child implements Father, Mother {
    //Overriding method1()
    public void method1() {
        System.out.println("Method from Father interface");
    }

    //Overriding method2()
    public void method2() {
        System.out.println("Method from Mother interface");
    }

    // Additional method specific to the Child class
    void childMethod() {
        System.out.println("Method specific to Child class");
    }
}

// Main class to test the multiple inheritance
class MultipleInherit{
    public static void main(String[] args) {
        
        Child child = new Child(); //Child class object

        // Calling methods from both Father and Mother interfaces
        child.method1();
        child.method2();

        // Calling the child-specific method
        child.childMethod();
    }
}

/*
 * Interface-Based Multiple Inheritance: Java supports multiple inheritance through interfaces only.
 * Multiple inheritance using interfaces provides flexibility and modularity in Java programs. 
 */
