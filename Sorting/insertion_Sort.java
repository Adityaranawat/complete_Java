public class insertion_Sort{
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current =arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev = prev-1;
            }  arr[prev]=current;
        }

    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
             System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        insertionSort(array);
        printArray(array);
    }
    
}