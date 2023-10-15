class FactorialCal{
    public static void main(String st[]) {
        int number = 5; // Calculate factorial of 5
        long fact = 1;

        // Calculating factorial using a for loop
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
