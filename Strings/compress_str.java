public class compress_str {
    public static StringBuilder com_Str(String str){
        StringBuilder st = new StringBuilder(" ");
        for(int i=0; i<=str.length(); i++){
            Integer count = 1;// baad mai string mai change karna padega 
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            } st.append(str);
                if(count>1){
                    st.append(count.toString());
                }
        }return st;
    }
    public static void main(String[] args) {
        String str = "aaaabbaaaacccc";
        System.out.println(com_Str(str));
        
    }
    
}
