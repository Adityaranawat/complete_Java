package Searching;

public class reverse_Array {
    public static void reverse_Arr(int num[]){
    int start=0;
    int end =num.length-1;
    while(start<end){
        int temp = num[start];
        num[start] = num[end];
        num[end] = temp;

        start++;
        end--;
    }
    
   } public static void main(String[] args) {
    int num[] = {1,2,3,4,5,6,7,8,9,10};
    reverse_Arr(num);
    for(int i =0; i<=10; i++){
        System.out.println(num[i]);

        }
    }
}
