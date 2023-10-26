class Animal{
    void sound(){
        System.out.println("Animal makes different sounds");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class RidingMain{
    public static void main(String st[]){
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound();
        dog.sound();
    }
}
