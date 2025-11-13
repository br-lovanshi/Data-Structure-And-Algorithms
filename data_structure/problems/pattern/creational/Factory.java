package data_structure.problems.pattern.creational;

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Credit card Payment");
    }
}

class Upi implements Payment{
    public void pay(){
        System.out.println("Upi Payment");
    }
}

abstract class PaymentFactory{
    abstract Payment createPaymentFactory();
}

class CreditCardPaymenteFactory extends PaymentFactory{
    public Payment createPaymentFactory(){
        return new CreditCard();
    }
}

class UpiPaymentFactory extends PaymentFactory{

    public Payment createPaymentFactory(){
        return new Upi();
    }
}

public class Factory {
    public static void main(String[] args) {
        
        PaymentFactory paymentFactory = new UpiPaymentFactory();
        Payment payment = paymentFactory.createPaymentFactory();
        payment.pay();
    }
}


// Create object via method
// Follow Open close principle