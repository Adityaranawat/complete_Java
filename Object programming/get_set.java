public class get_set {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color="blue";
        p1.tip=4;
        System.out.println(p1.color);
        
    }
    
}
class pen{
    String color;
    int tip;
    String setcolor(){
        return this.color;
    }
        void getcolor(int tip){
        this.tip=tip;
    } int gettip(int tip)
}
