import java.util.Scanner;
public class Array_1D_Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 13, 14, 15, 16};

        //While loop
        String choice="Yes";
        while(choice.equalsIgnoreCase("Yes")) {
            int[] newArr = new int[arr.length + 1];
            //Array Before insertion
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the index of value you want to insert:");
            int index = sc.nextInt();
            System.out.println("Enter the value you want to insert:");
            int value = sc.nextInt();
            //insertion Logic
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = value;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
            //Print Final array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("Do you want to insert another element?yes/no");
             choice = sc.next();
        }
        return;
    }
    }







