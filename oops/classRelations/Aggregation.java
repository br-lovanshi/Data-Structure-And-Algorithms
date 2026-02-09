class Engine{
   public void engineInfo(){}
}
class Car{
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }

    public void engine(){
        engine.engineInfo();
    }
}
public class Aggregation {
    public static void main(String[] args) {
        
        Engine engine = new Engine();
        engine.engineInfo();
        Car car = new Car(engine);
        car.engine();
    }
}

// Weak has a relation: without car engine can exists.
