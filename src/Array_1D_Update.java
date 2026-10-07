public class Array_1D_Update {
        public static void main(String[] args) {
            //Accessing Elements
            int[] arr={25,34,76,78,97};
            //Update Array
            System.out.println("Array Before Update.");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            arr[3]=56;
            arr[4]=44;
            System.out.println("Array After Update.");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

