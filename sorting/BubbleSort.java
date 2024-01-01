
class BubbleSort{
    public static void main(String[] args) {

        int arr[]= new int[]{4,3,2,5,6,1,7,8};
        int n= arr.length;

        for(int i=0;i<n;i++){

            int swapped= 0;  // making bubblesort optimal

            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    
                    int swap= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= swap;

                    swapped=1;
                }
            }
            if(swapped==0) break;
        }
    }
}