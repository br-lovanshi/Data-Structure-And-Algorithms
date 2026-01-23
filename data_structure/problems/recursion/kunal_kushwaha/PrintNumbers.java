package kunal_kushwaha;

public class PrintNumbers {
    public static void main(String[] args) {
        // print number n to 5 
        // printNumber(1);
        printNumberRec(5);
        // reverseArrayUsingRecursion(new int[]{1,2,3,4,5}, 0);
    }

    static void printNumber(int n){
        if(n > 5) return;
        System.out.print(n + " ");
        printNumber(n + 1);
    }

    public static void printNumberRec(int n){
        
        if(n < 0){
            return;
        }

        System.out.println(n);
        printNumberRec(n - 1);
    }

    public static void reverseArrayUsingRecursion(int[] arr, int index){
        if(index == arr.length){
            return;
        }

        reverseArrayUsingRecursion(arr, index + 1);
        System.out.println(arr[index]);
    }

    static void sumOfNNumbers(int n, int sum, int number){
        if(number == n){
            sum += number;
            System.out.println(sum);
            return;
        }

        sum += number;
        sumOfNNumbers(n, sum, number + 1);
    }
}
