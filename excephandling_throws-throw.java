class Exception_throws {

    // Method declaration with "throws" keyword indicating potential exception
    void checkAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age is: " + age);
    }
    public static void main(String st[]) {
        Exception_throws example = new Exception_throws();
        try {
            example.checkAge(-5); // This will throw an IllegalArgumentException
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

