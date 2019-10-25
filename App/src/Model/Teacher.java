package Model;


import java.util.ArrayList;

// Sego's teacher class
public class Teacher{

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

    //variables: name, age
    private String name = "";
    private int age = 0;
    //ArrayLists: universities, courses, students
    private ArrayList<University> universities = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    //constructors
    public Teacher(){
        this.name = "no name";
    }
    public  Teacher(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public ArrayList<Course> getCoursesTaught(){
        return courses;
    }

    public ArrayList<Course> getPreviousCoursesTaught(){
        return courses;
    }

    public ArrayList<Student> getAllStudentTaught(){
        return students;
    }



    public void gradeToStudent(Student student){

    }

    public void printInfo(){
        System.out.print(this.name + " teaches in: " + this.courses.get(1).getName());
        for(int i = 1; i < getCoursesTaught().length; i++){
            System.out.print(", " + this.courses.get(i).getName());
        }
        System.out.println(" on " + this.universities.getName() + ". ");
        System.out.println("All students taught are: " + this.getAllStudentTaught());
        System.out.println("------------------------------------------------------");
        System.out.println("more info to come... waiting for setup");
    }

}
