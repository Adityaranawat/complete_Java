package Searching;
import java.util.*;
public class largest_array{
public static int largest(int num[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<=6; i++){ // want to apply num.lenght to find the lenght of the array;
        if(num[i] > largest){
            largest = num[i];
            }
        } return largest;
    
    } public static void main(String[] args) {
        int arr[] = {23,45,5,34,231,12,43};
        System.out.println("The largest number in the array is: "+largest(arr));
        int large_Array = largest(arr);
        System.out.println(large_Array);
    }                          
}
