class Teacher{
    Teacher(){
        System.out.println("Teacher class constructor");
    }
}

class Students extends Teacher{
    Students(){
        super();    // Super Method
        System.out.println("Student class constructor");
    }
}

class SupMethod{
    public static void main(String st[]){
    Students obj1 = new Students();
    }
}

/*
 * Super Method should be use at top/first in sub-class constructor.
 * It's used to execute super class constructor first before completely execute sub-class constructor.
 */