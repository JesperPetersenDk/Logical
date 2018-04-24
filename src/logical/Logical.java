package logical;

public class Logical {

    public static void main(String[] args) {
       int students = 150;
       int rooms = 0;
       
       if(students < 25 && rooms >= 1)
       {
           System.out.println("succes for students and rooms!");
       }
       else if((students * rooms) == 150)
       {
           System.out.println("succes for students");
       }
       else
       {
           System.out.println("** End program **");
       }
    }
    
}
