public class access_Modifier {
    public static void main(String[] args) {
        bank b = new bank();
        b.username ="Aditya singh";
        b.setPassword(123);
        //System.out.println(b.Password);      WE CANNOT PRINT THE PASSWORD AS THE PASSWORD IS SET TOTHE PRIVATE ;
        classroom c = new classroom();
        c.Teacher="aditya";
        System.out.println(c.Teacher);
    }
    
}
class bank{
    public static final char[] Password = null;
    public String username ;
    private int password;
    void setPassword(int Password) {
        password=Password;
    }
public class classroom{
    protected String Teacher;    
    private String Pass;
    public String student;
    private int stu_Id;

    void  madam(String Staff){
       Teacher=Staff;
    
        
    }
   

}}
