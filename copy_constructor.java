class CopyStudent {
    String name;

    // Parameterized constructor
    CopyStudent(String name) {
        this.name = name;
    
    }

    // Copy constructor
    CopyStudent(CopyStudent other) {
        this.name = other.name;
    }

    String getName() {
        return name;
    }
}

class CopyConMain {
    public static void main(String st[]) {
        // Creating an object using the parameterized constructor
        CopyStudent originalStudent = new CopyStudent("Vinit");

        // Creating a new object by copying values from the original object using the 'copy constructor'
        CopyStudent copiedStudent = new CopyStudent(originalStudent);

        System.out.println("Original Student: Name - " + originalStudent.getName());
        System.out.println("Copied Student: Name - " + copiedStudent.getName());
    }
}

/*
1. It is a special constructor used to create a new object by copying the values of an existing object.
2. A copy constructor has a single parameter of the same class type. It takes an object of the class as an argument and initializes the new object's properties with the values from the passed object.
3. Copy constructors provide flexibility in object creation.
*/