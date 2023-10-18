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

/* --Throws Keyword--
 * throws is used in the method declaration to indicate that a method might throw a specific type of exception.
 * When a method uses throws, it signals that the method does not handle the exception internally and expects the caller to handle it.
 
 * --Throw Keyword--
 * throw is used to explicitly throw an exception within a method or a block of code.
 * throw is typically used inside the try block to handle exceptional situations programmatically.
 */
