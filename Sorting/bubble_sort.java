public class bubble_sort{
    public static void bubblesort(int[] array){
        int n =array.length-1;
        for(int turn=0; turn<n; turn++){
            for(int i=0; i<n-turn; i++){
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
            }
        }
    }
}  public static void main(String[] args) {
    int[] array={5,4,3,2,1};
    printArray(array);
    bubblesort(array);
    printArray(array);
}     
 // Utility function to print the array
 public static void printArray(int[] array) {
    for (int i=0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}

}