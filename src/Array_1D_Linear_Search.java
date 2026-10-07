import java.util.Scanner;
public class Array_1D_Linear_Search {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] arr={11,12,15,17,19,20};
            int num;
            boolean found=false;
            System.out.println("Enter a number to search in Array between 10 to 20.");
            num=sc.nextInt();
            for(int i=0;i<arr.length;i++){
                if(num==arr[i]){
                    found=true;
                    System.out.println(num+" found at index "+i);
                }
            }
            if(!found){
                System.out.println("Number not found in the Array.");
            }
        }
    }
