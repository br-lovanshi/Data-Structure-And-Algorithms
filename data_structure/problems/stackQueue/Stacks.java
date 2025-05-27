import java.util.Arrays;
import java.util.Stack;

class MyStack{
    private int[] arr;
    int capacity;
    int top;

    MyStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int ele){
        if(top == capacity-1){
            System.out.println("Stack overflow..");
            return;
        }
        arr[++top] = ele;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow..");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()) return -1;
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public String toString(){
//        System.out.println(Arrays.toString(arr));
        return Arrays.toString(arr);
    }
}
public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.add(8));
        stack.add(4);
        stack.add(5);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.add(8));
        System.out.println(stack.add(8));
        System.out.println(stack);

        MyStack customStack = new MyStack(4);
        System.out.println(customStack.isEmpty());
        System.out.println(customStack.capacity);
        customStack.push(1);
        customStack.push(15);
        customStack.push(5);
        customStack.push(25);
        System.out.println(customStack);
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
        reverseArrayUsingStack();
    }

    public static void reverseArrayUsingStack(){
        int[] arr = {1,2,5,7,9,6,2};
        Stack<Integer> stack = new Stack<>();
        for(int num:arr){
            stack.push(num);
        }
        int[] revArr = new int[stack.size()];
        int i = 0;
        while(i < arr.length){
            revArr[i++] = stack.pop();
        }
        System.out.println("Reverse Stack " + Arrays.toString(revArr));
    }
}
