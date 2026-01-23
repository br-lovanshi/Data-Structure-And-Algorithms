
interface Invoice{
    void calculate();
    void persistence();
    void printInvoice();
}

interface InvoiceCalculator{
    void calculate();
}

interface InvoiceRepo{
    void persist();
}

interface InvoicePrint{
    void printInvoice();
}

public class SipRev {

    public static void main(String[] args) {

    }
}

// Each class should be responsible for only single operation.