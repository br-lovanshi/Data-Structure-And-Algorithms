package data_structure.problems.pattern.creational;

class Employee implements Cloneable{
    private int id;
    private String name;

    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone(); // shallow copy
    }
}
public class Prototype {

    public static void main(String[] args) throws Exception{
        Employee e = new Employee(0, null);
        Employee e2 = e.clone();
    }
    
}
