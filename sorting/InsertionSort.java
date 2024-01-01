public class InsertionSort {
    public static void main(String[] args) {

        int arr[]= new int[]{4,3,2,5,6,1,7,8};
        int size= arr.length;

        for(int i=0;i<size;i++){

            int j=i;

            while(j!=0 && arr[j]<arr[j-1]){

                int swap= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= swap;
                
                j--;
            }
        }
    }
}
