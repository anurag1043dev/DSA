import java.util.*;
public class 
ArrayBasics{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};  //  MTD 1 OF CREATING ARRAY
        int arr1[]=new int[5];  // MTD 2 OF CREATING ARRAY
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        // Input values for array 1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for array 1:");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();

            
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){     //output array
            System.out.print(arr[i]+" ");  
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(2*arr1[i]+" ");  // array to same hi h 
                                            // hmne bss 2 se multiply kra diya
        }
        System.out.println(arr1[0]);  // output 1st element of array

        arr=new int [10];  // reinitializing array with new size


       char ch="\0"; 
       /// to print ascii value
       System.out.println((int)ch);  // output 0
    }
}