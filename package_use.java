import p1.packages;
class PackAccess{
    public static void main(String st[]){

        packages packobj1 = new packages(); //Unqualified way
        packobj1.display();

        p1.packages packobj2 = new p1.packages(); // Qualified way
        packobj2.display();
    }
}

/*
 * Qualified Package Name:

   * Specifies the full package path of a class, including all parent packages.
   * Used when there are naming conflicts between classes from different packages.
   * Provides a clear and unambiguous reference to a specific class.
   * Ensures precise identification of the class within the entire package structure.

 * Unqualified Package Name:

   * Used after 'importing' the class to simplify code and enhance readability.
   * Refers to only the last part of the package name.
   * Allows you to use just the class name without the full package path.
   * Enhances code readability by reducing verbosity, especially in smaller files or when dealing with classes from a single package.
 */