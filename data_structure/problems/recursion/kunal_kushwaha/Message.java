package kunal_kushwaha;
public class Message{
    public static void main(String args[]){
        // print(5);
        message();
    }

    static void message(){
        System.out.println("Hello world!!");
        message1();
    }

      static void message1(){
        System.out.println("Hello world!!");
        message2();
    }

      static void message2(){
        System.out.println("Hello world!!");
        message3();
    }

      static void message3(){
        System.out.println("Hello world!!");
        message4();
    }

      static void message4(){
        System.out.println("Hello world!!");
    }

    public static void print(int n){
        if(n <1) return;

        System.out.println("Namaste Recursion");
        print(n-1);
    }
}