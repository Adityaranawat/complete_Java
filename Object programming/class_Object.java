public class class_Object{
    public static  void main(String[] args) {
       /*  student s1 = new student();
        student.name= "aditya";*/

        pen p1 = new pen();
        p1.color = "blue";
        p1.price = 5;
        p1.type = "Cello";
        
        System.out.println(p1.color);
        System.out.println(p1.price);
       // System.out.println(student.name);
}
}
class pen{
    String color;
    int price;
    String type;

    void pen_Color(String colour){
        color= colour;
    }
    void pen_Prize(int prize){
        price= prize;
    }
    void pen_Type(String p_type){

       type= p_type;
    }
   public class student{
        String name;
        int roll_No;
        int[] marks;
        void stu_Name(String namee){
            name = namee;
        }

    } 
}