package com.Lecture3_Lopps_Conditional;

public class Count{
    public static void main(String[] args){
        int[] arr={1,3,8,5,7,5,7,8,7,9};
        int key =7 ,count=0;
        int l= arr.length;
        for(int i = 0 ; i < arr.length ;i++){
            if(key == arr[i])
                count++;
        }
        System.out.println("Count for given key is "+count);
    }
}