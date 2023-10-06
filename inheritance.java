//Super class
class Details{
    void d(int a, String b){
        String name = b;
        int age = a;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
//extends keyword used to perform inheritance
//Sub class
class Students extends Details{    
    public static void main(String st[]){
        Details obj1 = new Details();
        obj1.d(20,"Vinit");
    }
}
