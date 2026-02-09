class Dog extends Animal{
    public void bark(){}
    
    @Override
    public void run(){}
}

abstract class Animal{
    abstract public void run();
}

public class IsARelation {
    
    public static void main(String[] args) {
        
        Animal animal = new Dog(); // dog is a animal
        animal.run();

    }
}

// Parent child relation dog is animal, car is a vehicle