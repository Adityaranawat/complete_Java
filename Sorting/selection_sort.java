public class selection_sort{
    public static void selectionSort(int[] array){
        int n =array.length-1;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(array[min]>array[j]){
                min=j;

                } int temp = array[min];
                  array[min] = array[i];
                  array[i] = temp;
            }
        }
    } public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
             System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        selectionSort(array);
        printArray(array);
    }
}