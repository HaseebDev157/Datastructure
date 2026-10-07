import java.util.Scanner;
public class Stack_array {
   static int[] Stack=new int[5];
   static int top=-1;
    void push() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value to Push:");
        int value=sc.nextInt();
        if (top == Stack.length - 1) {
            System.out.println("Stack overflow!");
        } else {
            top++;
            Stack[top] = value;
            System.out.println("Pushed:"+value);
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow!");
        }
        else {
            System.out.println("Poped:"+Stack[top]);
            top--;
        }
   }
    void peek(){
        if(top==-1){
            System.out.println("Stack is Empty!");
        }
        else {
            System.out.println("Peek:" + Stack[top]);
        }
   }
    void isEmpty(){
       if(top==-1){
           System.out.println("Stack is Empty!");
       }
       else {
           System.out.println("Stack is not Empty!");
       }
   }
   void isFull(){
        if(top==Stack.length-1){
            System.out.println("Stack is Full!");
        }
        else{
            System.out.println("Stack is not Full!");
        }
    }
    void Display(){
        if(top==-1){
            System.out.println("Stack Underflow!");
        }
       for(int i=0;i<Stack.length;i++){
           System.out.print(Stack[i]+" ");
       }
       System.out.println();
    }
    static void main(String[] args) {
        Stack_array s=new Stack_array();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4. Peek");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7.Exit");

            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.Display();
                    break;
                case 4:
                    s.peek();
                    break;
                case 5:
                    s.isEmpty();
                    break;
                case 6:
                    s.isFull();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
            }
        }
    }

