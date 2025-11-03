package kunal_kushwaha;

public class NthFactorial{
    public static void main(String[] args) {
        int n = 5;
        int out = fact1(n); // itrative way
        fact(n, 1);
        System.out.println(out);
    }

    static int fact1(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    static int fact(int n, int factValue){
        if(n == 1){
            return factValue;
        }

        factValue *= n;
        return fact(n -1, factValue);
    }
}