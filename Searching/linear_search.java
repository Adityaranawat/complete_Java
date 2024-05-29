package Searching;
import java.util.*;

public class linear_search {
    public static int linear(int arr[] , int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        } 
        return -1;
    } public static void main(String[] args) {
        int Arr[] = {1,23,45,56,8,76,6,54,34,56}; 
        int key = 8;
        int index =linear(Arr, key);
        System.out.println("found at "  +index+  "value");
    }
}
           
