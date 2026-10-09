public class Insertion_Sort {
    static void printarray(int[] arr){
        for (int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // O(n^2
    static void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev= i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }
    static void main(String[] args) {
        int[] arr={12,4,15,9,19,45,33};
        printarray(arr);
        System.out.println();
        System.out.println("sorted array");
        insertionsort(arr);
        printarray(arr);
    }
}
