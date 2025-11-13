package data_structure.problems.pattern.structure;

class LegacySystem{
    void transactions(String currency, double amount){
        System.out.println(amount + " Recivied");
    }
}
interface RazorpayPaymentSystem{
    void pay(double amount);
}

class LegacySystemAdapter implements RazorpayPaymentSystem{
   private LegacySystem legacySystem;

   LegacySystemAdapter(LegacySystem legacySystem){
    this.legacySystem = legacySystem;
   }

   public void pay(double amt){
    this.legacySystem.transactions(null, amt);
   }
}

public class Adapter {
    public static void main(String[] args) {
        RazorpayPaymentSystem lAdapter = new LegacySystemAdapter(new LegacySystem());
        lAdapter.pay(3003.3);
    }
}


// integrate new service into legacy system