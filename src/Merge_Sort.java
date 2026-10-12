import java.util.Scanner;
public class Merge_Sort {
    static int[] arr;
    static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int [] temp=new int [end - start + 1];
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //copy remaining into temp
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy the temp array into original array
        for(int x=0;x<temp.length;x++){
            arr[start+x]=temp[x];
        }
    }
    static void merge_sort(int start, int end) {
        int mid =start+(end-start)/ 2;
        if(start<end){
            merge_sort(start,mid);
            merge_sort(mid+1,end);
            merge(start,mid,end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //number input
        System.out.println("Enter the Number of Element you want to ente then Press Enter: ");
        int num = sc.nextInt();
         arr = new int[num];

         //input elements
        System.out.println("Enter the Element you want to Enter: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        //function call
            merge_sort(0,arr.length-1);

        //Printing sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
