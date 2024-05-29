package Searching;

public class binary_search {
    public static int binary(int num[] , int key){
        int start =0;
        int end = num.length-1;
        while(start<=end){  
            int mid = (start + end)/2;
            if(num[mid]==key){
                return mid;
                }
                if(num[mid]>key){ //right side of mid
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            return -1;
        } public static void main(String[] args) {
            int num[] = {1,2,3,4,5,6,7,8,9,10};
            int key = 5;
            int result = binary(num,key);
            System.out.println(result);
        }
}