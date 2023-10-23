/**
 *
 * @author user
 */
public class ShowStudent {


    public static void main(String[] args)
    
    {
    
    
    Student obj=new Student(20815907, 3, 5);
    
    
    System.out.println("Student Details");
    
    obj.displayIDNumber();
    
    
    
    obj.displayPointsEarned();
    
    System.out.println("Average Grade Point is:"+obj.computeGradePointAverage());
    
    }
    
    
    
    }
    
    