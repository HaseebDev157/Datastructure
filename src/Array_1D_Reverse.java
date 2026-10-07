import java.util.Scanner;
public class Array_1D_Reverse {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers you want to enter in array.");
            int num=sc.nextInt();
            int[] arr=new int[num];
            System.out.println("Enter Number in Array.");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            System.out.println("Reversed Array.");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
