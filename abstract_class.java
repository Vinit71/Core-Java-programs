abstract class Abstractclass{

    abstract void info(); //abstract function

    void display(){
        System.out.println("Hello");
    }
}

class AbsMain extends Abstractclass{
    void info(){
        System.out.println("Defining Method");
    };
    public static void main(String st[]){
        AbsMain obj = new AbsMain();
        obj.info();
        obj.display();
    }
}

/*Abstract class:
1. We cannot create object of an abstract class.
2. May contatin Abstract Methods(Methods without implementation)
3. We can inherit an abstract class.
*/