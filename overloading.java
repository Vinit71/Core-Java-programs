class Cal{
    //takes two argument
    int sum(int a, int b){
        return a + b;
    }
    //takes three arguments
    int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String st[]){
        Cal obj = new Cal();
        int sum1 = obj.sum(5,10);
        System.out.println("The sum of these two numbers is: "+sum1);
        int sum2 = obj.sum(5,10,15);
        System.out.println("The sum of these three numbers is: "+sum2);
    }
}