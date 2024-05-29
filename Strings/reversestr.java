public class reversestr {
    public static String rev_str(String str){
        char[] char_Arr = str.toCharArray();
        for(int i = char_Arr.length-1; i >= 0; i--){
            System.out.print(char_Arr[i]);
        }
           // return 0;
           return null;
    } 
    public static void main(String[] args) {
        String str = "hello Aditya";
        String reverse_string=  rev_str(str);
        System.out.println(reverse_string);
        
    }
}
