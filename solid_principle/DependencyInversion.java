class Database{
    void save(){};
}

class MySql{
    public static void main(String[] args) {
        Database db = new Database(); // tightly coupled
    }
}

interface DB{
    void save();
}
class MySqlDb implements DB{
    @Override
    public void save(){
        System.out.println("MySql DB");
    }
}
class Postgress implements DB{

    @Override
    public void save(){}
}

class DbService{
    private DB db;
    DbService(DB db){
        this.db = db;
    }

    void save(){
        db.save();
    }
}
public class DependencyInversion {
    public static void main(String[] args) {
        
    }
}

// parent class shuld not dependent on child class both should lossly coupled