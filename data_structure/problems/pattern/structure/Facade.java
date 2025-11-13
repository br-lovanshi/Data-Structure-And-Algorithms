package data_structure.problems.pattern.structure;

class Delivery{
    void tracking(){

    }
}

class Payment{
    void pay(double amt){

    }
}

class Restourants{
    void cook(){

    }
}

class Order{
    private Restourants restourants;
    private Payment payment;
    private Delivery delivery;

    Order(Restourants restourants, Payment payment, Delivery delivery){
        this.restourants = restourants;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void placeOrder(double amt){
        this.payment.pay(amt);
        this.restourants.cook();
        this.delivery.tracking();
    }
}
public class Facade {
    public static void main(String[] args) {
        
        Order order = new Order(new Restourants(), new Payment(), new Delivery());
        order.placeOrder(4000.4);
    }
}


// hide complaxity: like zomato when place order it handles all Restourants, payment, delivery