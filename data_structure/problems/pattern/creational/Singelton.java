package data_structure.problems.pattern.creational;

class Connection{
    private static Connection connection;

    private Connection(){};

    public static Connection getConnection(){
        synchronized (Connection.class){
            if(connection == null){
                connection = new Connection();
            }
            return connection;
        }
    }
}

public class Singelton {
    public static void main(String[] args) {
        
    }
}
