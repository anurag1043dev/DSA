import java.util.*;

public class pairSum{
    // 1
    //brute force approach
    //2. two pinter approach
    //3  hashmap Approach
    

    
    public static void main(String args[]){
        int arr[]={1,5,8,-3};
        int targetSum=2;

        // BRUTE FORCE!
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
                if(arr[i]+arr[j]==targetSum) System.out.println("index of elemnt id by BRUTE FORCE"+i+"and "+j);
                  flag=true;
            }
        }
        if(!flag){
            System.out.println("not found any such pair ");
        }


        // HAsh appraoch!


        //we know target sum
        // Map<Integer,Integer> map=new LinkedHashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],i);
        // } 
        // for(int i=0;i<arr.length;i++){
        
        //     int newTarget=targetSum-arr[i];
        //     if(map.containsKey(newTarget)){

        //         System.out.println("index of elemnt id by HASHMAP"+i+" "+map.get(newTarget));
        //     }
        }
        }
    
