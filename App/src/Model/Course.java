package Model;

import java.util.ArrayList;

public class Course {

    /**
     *
     *
     *  Remember to make at least one constructor (and consider whether there is need for more)
     *
     *  Consider the class variables needed
     *
     *  If you are creating a new method, think about whether it should be used from outside the class or not;
     *  If not, make it private. Don't let other classes modify sensitive information for your class.
     *
     *
     *  Some methods return arrays now. They can also be changed to return ArrayLists instead, but
     *  you have to decide together with the team on either one or the other, so there is consistency.
     *
     *
     *  Talk to each other! Remember your implementations should work together. The system is not finished until
     *  everything is finished.
     *
     *
     * The printInfo() method should print a readable, easily to understand String representation of the specific instance of the class,
     * preferably on several lines.
     *
     *
     * **/
   private String courseName;
   private String description;

   private ArrayList <Student> students;

    public Course(String name,  String XXbeskrivelse){
      courseName = name;
      description = XXbeskrivelse;

    }

    public  void AddStudent(Student elev) { students.add(elev); }
    public  void RemoveStudent(Student elev) { students.remove(elev); }
    public String getCourseName(){ return courseName; }

    public String getDescription() { return description; }

    public int getMaximumNumberOfStudents(){return -1; }

    public Teacher getTeacher(){
        return new Teacher();
    }

    public ArrayList <Student> getEnrolledStudents(){ return new ArrayList<Student>(); }

    public int getNumberOfEnrolledStudents(){
        return -1;
    }

    public int getAvailablePlaces(){ return -1;
    }

    public void printInfo(){

        }

    }
}
