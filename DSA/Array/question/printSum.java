import java.util.*;
public class printSum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        int arr[]=new int [5];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is "+sum);
    }
}7