public class MinMax{
    public static void main(String args[]){

        int arr[]={12,34,56,67};  // 16 bytes
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        System.out.println("Minimum value in the array is: " + min);
        System.out.println("Maximum value in the array is: " + max);
    }
}