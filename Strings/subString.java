public class subString {
    public static String sub_string(String str, int start, int end){
        String substring = "";
        for(int i=start; i<=end; i++){
            substring += str.charAt(i);
        } return substring;
    } public static void main(String[] args) {
        String str = "Hello Aditya";
        System.out.println(str.substring(4,7));
        System.out.println(sub_string(str,2, 5));
    }
    
}