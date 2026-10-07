import java.util.Scanner;
public class Array_1D_Deletion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {12, 13, 14, 15, 16};

            //While loop
            String choice="Yes";
            while(choice.equalsIgnoreCase("Yes")) {
                if(arr.length!=0) {
                    int[] newArr = new int[arr.length - 1];
                    //Array Before insertion
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Enter the index of value you want to Delete:");
                    int index = sc.nextInt();
                    //insertion Logic
                    for (int i = 0; i < index; i++) {
                        newArr[i] = arr[i];
                    }
                    for (int i = index; i < newArr.length; i++) {
                        newArr[i] = arr[i + 1];
                    }
                    arr = newArr;
                    //Print Final array
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
                else {
                    System.out.println("Array has no element in it to delete!");
                    return;
                }

                System.out.println("Do you want to Delete another element?yes/no");
                choice = sc.next();
            }
            return;
        }
    }
