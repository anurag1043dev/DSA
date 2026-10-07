public class ShallownDeepCopy{
    public static void main(String args[]){

       int arr[]={12,34,56,67};  // 16 bytes


    1 => SHALLOW COPY
       int x[]=arr; // Shallow copy => x and arr points to same memory location
       x[0]=99;  // changing value of x will also change value of arr!


    2 => DEEP COPY 
         int y[]=new int[arr.length];  // creating new array of same size as arr
         for(int i=0;i<arr.length;i++){
              y[i]=arr[i];  // copying values of arr to y
         }
         y[0]=100;  // changing value of y will not change value of arr!

         //OR 
         int z[]=Arrays.copyOf(arr, arr.length);
         z[0]=100;  // changing value of z will not change value of arr!
    }
}