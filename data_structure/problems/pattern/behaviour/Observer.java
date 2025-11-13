package data_structure.problems.pattern.behaviour;

import java.util.ArrayList;
import java.util.List;


interface Observers{
   
    public void sendNotification(String msg);
}

class User implements Observers{

    private int id;
    private String name;

    User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void sendNotification(String msg){
        System.out.println("Dear " + name + " get new notification " + msg);
    }
}

interface Subject {

     void subscribe(Observers observers);
     void unsubscribe(Observers observers);
     void SendNotification(String msg);
}

class Channel implements Subject{
    List<Observers> observersList = new ArrayList<>();
    
    public void subscribe(Observers observers){
        observersList.add(observers);
    }

    public void unsubscribe(Observers observers){
        observersList.remove(observers);
    }

    public void SendNotification(String msg){
        for(Observers observers: observersList){
            observers.sendNotification(msg);
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        Observers o1 = new User(1, "Ram");
        Observers o2 = new User(2, "Shyam");

        Subject consumer = new Channel();
        consumer.subscribe(o1);
        consumer.subscribe(o2);
        consumer.SendNotification("New video has been uploaded.");

    }
}


// Followed pub-sub model, it is structure design pattern