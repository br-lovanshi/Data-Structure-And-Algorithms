package kunal_kushwaha;

public class PrintNumbers {
    public static void main(String[] args) {
        // print number n to 5 
        printNumber(1);
    }

    static void printNumber(int n){
        if(n > 5) return;
        System.out.print(n + " ");
        printNumber(n + 1);
    }
}
