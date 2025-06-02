interface Works{
    void eat();
    void work();
}

class Robots implements Works{
    @Override
    public void eat(){} // robot can't eat

    @Override
    public void work(){}
}

interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

class Robot implements Workable{
    @Override
    public void work(){}
}
public class InterfaceSegragetion {
    public static void main(String[] args) {
        
    }
}
 
// Don't force a class implement method that does not in used.