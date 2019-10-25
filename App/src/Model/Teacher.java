package Model;


import java.util.ArrayList;

// Sego's teacher class
public class Teacher {

    /**
     * Remember to make at least one constructor (and consider whether there is need for more)
     * <p>
     * Consider the class variables needed
     * <p>
     * If you are creating a new method, think about whether it should be used from outside the class or not;
     * If not, make it private. Don't let other classes modify sensitive information for your class.
     * <p>
     * <p>
     * Some methods return arrays now. They can also be changed to return ArrayLists instead, but
     * you have to decide together with the team on either one or the other, so there is consistency.
     * <p>
     * <p>
     * Talk to each other! Remember your implementations should work together. The system is not finished until
     * everything is finished.
     * <p>
     * <p>
     * The printInfo() method should print a readable, easily to understand String representation of the specific instance of the class,
     * preferably on several lines.
     **/

    //variables: name, age
    private String name = "";
    private int age = 0;
    //ArrayLists: universities, courses, students
    private ArrayList<University> universities = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    //constructors
    public Teacher() {
        this.name = "no name";
    }

    public Teacher(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public ArrayList<Course> getCoursesTaught() {
        return courses;
    }

    public ArrayList<Course> getPreviousCoursesTaught() {
        return courses;
    }

    public ArrayList<Student> getAllStudentTaught() {
        return students;
    }


    public void gradeToStudent(Student student) {

    }

    public void printInfo() {
        System.out.print(this.name + " teaches in: " + this.courses.get(0).getCourseName());
        for (int i = 1; i < courses.size(); i++) {
            System.out.print(", " + this.courses.get(i).getCourseName());
        }
        System.out.println("On these universities: ");
        for (int i = 0; i < universities.size(); i++) {
            universities.get(i).printInfo();
        }
        System.out.println("All students taught are: ");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printInfo();
        }
        System.out.println("------------------------------------------------------");
        System.out.println("more info to come... waiting for setup");
    }

}
