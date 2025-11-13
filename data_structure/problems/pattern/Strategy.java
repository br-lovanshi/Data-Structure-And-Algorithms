package data_structure.problems.pattern;

interface PaymentStrategy {

    void pay(double amt);
}

class UpiStrategy implements PaymentStrategy{
    public void pay(double amt){
        System.out.println("Paying " + amt + " via upi.");
    }
}
class CardStrategy implements PaymentStrategy{
     public void pay(double amt){
        System.out.println("Paying "+ amt + " via card.");
     }
}

class PaymentService{
    private PaymentStrategy paymentStrategy;
    PaymentService(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amt){
        this.paymentStrategy.pay(amt);
    }
}

public class Strategy {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CardStrategy());
        paymentService.makePayment(30303.0);
    }
}


// structure desing pattern, remove if-else or manual way to execute algorithms lets runtime decide which algorithms needs to execute.
