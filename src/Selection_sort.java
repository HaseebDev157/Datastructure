import java.util.Random;
public class Selection_sort {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void Selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
        }
    }

    static void main(String[] args) {

        int[] arr = new int[1000];
        Random rand = new Random();

        // Generate 1000 random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000) + 1;
        }
        System.out.println("Original Array");
        printarray(arr);
        System.out.println("sorted array");
        long starttime=System.nanoTime();
        Selectionsort(arr);
        long endtime=System.nanoTime();
        long duration=endtime-starttime;
        printarray(arr);
        System.out.println(duration/1_000_000_000.0+" Seconds");
    }
}

