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
        int[] arr = {12, 4, 15, 9, 19, 45, 33};
        printarray(arr);
        System.out.println("sorted array");
        Selectionsort(arr);
        printarray(arr);
    }
}

