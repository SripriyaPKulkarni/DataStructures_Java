package practice;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take the array size from the user
        System.out.println("Enter the size of the array: ");

        int arr_size=0;
        if(sc.hasNext()){
            arr_size=sc.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] arr = new int[arr_size];

        // Take user elements for the array
        System.out.println(
                "Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        for (int i=0; i<arr_size; i++)
        {
            System.out.println(arr[i]);
        }
        //Take the array size from the user
        System.out.println("Enter the target: ");
        int target=0;
        if(sc.hasNext()){
            target= sc.nextInt();
        }

        TwoSum twoSum=new TwoSum();
       // twoSum.twosum(arr,target);

        //create an array to store out put and display
        int[] array=new int[2];

        //array= twoSum.twosum(arr,target);
        array=twoSum.twoSum(arr,target);

        for (int k=0; k<2; k++)
        {
            System.out.println(array[k]);
        }



    }


    //using bruteforce approach
    /*public int[] twosum(int arr[],int target){

        int[] nums=new int[2];

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j]==target) {
                    nums[0]=i;
                    nums[1]=j;

                    return nums;
                }
            }
        }
        return nums;
    }*/

    //using hashmap
    public int[] twoSum(int arr[],int target)
    {
        //declaring an array to store the output
       int[] nums={0,0};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(target-arr[i])){
                nums[0]=i;
                nums[1]=map.get(target-arr[i]);

                return nums;

            }else{
                map.put(arr[i],i);
            }
        }
        return nums;




    }
}
