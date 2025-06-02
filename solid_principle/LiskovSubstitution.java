
interface Birds{
    void fly();
}

class Ostrich implements Birds{
    @Override
    public void fly(){
        throw new UnsupportedOperationException(); // ostrich can't fly
    }
}

interface Bird{}
interface Flyable extends Bird{
    void fly();
}

class Ostrich1 implements Bird{

}
public class LiskovSubstitution {
    public static void main(String[] args) {
        
    }
}

// Child class should be replaceable without breaking functionality.