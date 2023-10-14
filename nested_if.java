class Voter{
    public static void main(String st[]) {
        int age = 17;
        boolean isCitizen = true; // Citizenship status (true for citizen, false for non-citizen)

        if (isCitizen) {
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } 
            else {
                System.out.println("You are not eligible to vote. Minimum voting age is 18.");
            }
        } 
        else {
            System.out.println("Only citizens are eligible to vote.");
        }
    }
}

/*A nested if statement is an if statement that is placed inside another if or else statement, 
allowing for multiple levels of conditions to be checked within a single program flow.
*/