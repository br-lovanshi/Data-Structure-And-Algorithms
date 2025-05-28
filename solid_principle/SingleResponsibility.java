
class Invoices { // class has 3 responsibilities: calculation, printing, and saving
    void calculateTotal() { /* logic */ }
    void printInvoice() { /* printing logic */ }
    void saveToDB() { /* persistence logic */ }
}


// Single Responsibility Principle Applied
class Invoice{
    void calculation(){
        System.out.println("Calculating...");
    }
}

class Print{
    void print(){
        System.out.println("Printing...");
    }
}
class Persistence{
    void save(){
        System.out.println("Saving invoice...");
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.calculation();
        Print print = new Print();
        print.print();
        Persistence persistence = new Persistence();
        persistence.save();
    }
}
