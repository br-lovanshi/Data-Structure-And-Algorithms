package data_structure.problems.pattern;

public class Dry {
    public static void main(String[] args) {
        // do not repeat
        int a = 10;
        int b = 30;
        System.out.println(a + b);

        int c = 20;
        int d = 30;
        System.out.println(c+d);

        sum(30, 30);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
}
