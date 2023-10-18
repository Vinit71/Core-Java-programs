class StringExample{
    public static void main(String st[]){
    //  assining value by reffernce object of String
        String str1 = "Vinit";
        System.out.print(str1);

     // a String object is created using the new keyword, and the value "Hello" is assigned to it.
        String str2 = new String("Hello");
        System.out.print(str2);
    }
    
}

/* String is a Inbuild class in java. It's in a package that is 'java.lang' 

 * Immutability: Strings in Java are immutable, meaning their values cannot be changed after creation. 
   Any operation that appears to modify a string actually creates a new string object.

 * String Pool: Java maintains a pool of strings (known as the string pool) to conserve memory. 
   String literals are automatically interned, allowing multiple variables to refer to the same underlying string object.

 * Common Methods: The String class provides useful methods for string manipulation, such as charAt(), length(), substring(), and equals().    
*/