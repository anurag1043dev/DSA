import java.util.*;
public class ArraySortBuiltin{
    public static void main(String []args){
            
        int arr[]={10,3,5,6};
        System.out.println("Before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);  // sorting array in ascending order
        System.out.println();
        System.out.println("After sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 

    }
}