public class Bubble_sort {
    static void printarray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void main(String[] args) {
    int[] arr={12,4,15,9,19,45,33};
    printarray(arr);
    System.out.println("sorted array");
    bubblesort(arr);
    printarray(arr);
    }
}
