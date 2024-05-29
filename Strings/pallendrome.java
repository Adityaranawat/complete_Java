public class pallendrome {
    public static boolean pallen_Drome(String str){
        int start = 0;
        int n = str.length();
        int end = n-1;
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
              return false; 
            } 
        }return true;
    }public static void main(String[] args) {
        String str = "heeh";
        System.out.println(pallen_Drome(str));
        
    }
    
}
