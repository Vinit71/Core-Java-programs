class ForEachExample{
    public static void main(String st[]) {
        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};

        System.out.println("Fruits in the array:");

        // Using for-each loop 
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

/* The for-each loop provides a simpler and more readable syntax for iterating through arrays 
 * It is designed for read-only access to elements. It does not provide the ability to modify array elements while iterating.
*/