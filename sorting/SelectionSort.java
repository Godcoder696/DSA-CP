
class SelectionSort{
    public static void main(String[] args) {

        int arr[]= new int[]{3,2,14,5,6,7,10};

        int size= arr.length;
        
        for(int i=0;i<size;i++){

            int min=Integer.MAX_VALUE;

            for(int j=i;j<size;j++){

                if(min>arr[j]){
                    
                    int swap= arr[i];
                    arr[i]= arr[j];
                    arr[j]= swap;
                    
                    min= arr[i];
                }
            }
        }

        for(int i: arr) System.out.print(i+" ");
    }
}