
import javax.smartcardio.Card;

class Pay{
    void pay(String type){
        if(type.equalsIgnoreCase("UPI")){
            System.out.println("Upi payment");
        }else if(type.equalsIgnoreCase("CARD")){
            System.out.println("Card payment");
        }
    }
}

//OPC
interface Payment{
    void pay(double amt);
}

class UpiPayment implements Payment{

    @Override
    public void pay(double amt){
        System.out.println("Upi payment " + amt);
    }
}

class CardPayment implements Payment{
    @Override
    public void pay(double amt){
        System.out.println("Card payment " + amt);
    }
}

class PaymentProcessor{
//    Payment payment;
//
//    PaymentProcessor(Payment payment){
//        this.payment = payment;
//    }

    void pay(Payment payment, double amt){
        payment.pay(amt);
    }
}

public class OcpRev {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.pay(new UpiPayment(), 30);
    }
}

// Open for extension but closed for modification