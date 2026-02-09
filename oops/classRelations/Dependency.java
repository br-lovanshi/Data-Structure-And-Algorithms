
interface Payment{
    void pay(double amt);
}

class Upi implements Payment{

    @Override
    public void pay(double amt){}
}

class Order{
    
    public void paymentMethod(Payment payment, double amt){ // temprory using another class
        payment.pay(amt);
    }
}
public class Dependency {
    public static void main(String[] args) {
        
        Order order = new Order();
        order.paymentMethod(new Upi(), 400.0);
    }
}

// Uses a relation: one class temprory user another.