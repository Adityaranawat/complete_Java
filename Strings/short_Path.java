public class short_Path {
    public static float shortest_path(String str){
        int n = str.length();
        int x=0 , y=0;
        for(int i=0; i<=n-1; i++){
            char dir = str.charAt(i);
            if(dir=='E'){
               x++; 
            }
            else if(dir=='W'){
                x--;
            } 
            else if(dir=='N'){
                y++;
            }else{
                y--;
            }
        } int x2=x*x;
          int y2 = y*y;
          return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WWWSENENN";
        System.out.println(shortest_path(str));
        
    }
    
}
