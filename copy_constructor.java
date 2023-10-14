class Student {
    String name;

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
    }

    String getName() {
        return name;
    }
}

class Main {
    public static void main(String st[]) {
        // Creating an object using the parameterized constructor
        Student originalStudent = new Student("Vinit");

        // Creating a new object by copying values from the original object using the 'copy constructor'
        Student copiedStudent = new Student(originalStudent);

        System.out.println("Original Student: Name - " + originalStudent.getName());
        System.out.println("Copied Student: Name - " + copiedStudent.getName());
    }
}

/*
1. It is a special constructor used to create a new object by copying the values of an existing object.
2. A copy constructor has a single parameter of the same class type. It takes an object of the class as an argument and initializes the new object's properties with the values from the passed object.
3. Copy constructors provide flexibility in object creation.
*/