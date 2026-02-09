
class Home{

    private Room room = new Room();// strong has relationship

    void rooms(){
        room.getTotalRoom();
    }
}

class Room{
    void getTotalRoom(){}
}

public class Composition {
    public static void main(String[] args) {
        Home home = new Home();
        home.rooms();
    }
}


// it is an has-a relation. strong has a relation