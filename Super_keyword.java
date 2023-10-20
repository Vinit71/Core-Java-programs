class Superkeyword{
    int x = 10;
}

class SupKeyExample extends Superkeyword{
    int x=20;
    void display(){
        System.out.println("The value of x belongs to this class: "+x);
        System.out.print("The value of x belongs from super class: "+super.x); //Super Keyword
    }
  
    public static void main(String st[]){
        SupKeyExample obj = new SupKeyExample();
        obj.display();
    }
}

/*
 * Accessing Parent Class Members: Super keyword is used to access the instance variables and methods of the parent class.
 * Refers to Parent Class: The super keyword in Java is a reference variable that is used to refer to the immediate parent class object.
 */