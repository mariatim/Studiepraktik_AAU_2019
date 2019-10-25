package Model;
import java.util.ArrayList;
import java.util.HashMap;

public class University {

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

    private HashMap<Student> enrolledStudents = new HashMap<Student>();
    private ArrayList<Student> previosly
    private HashMap<Course, Boolean> availableCourses = new HashMap<Course, Boolean>();

    public ArrayList<Course> getAvailableCourses() {
        return availableCourses.keySet().toArray();
    }

    public void addAvailableCourse(Course course) {
        availableCourses.put(course, true);

    }

    public void makeCourseUnavailable(Course course) {
        availableCourses.get(course, availableCourses.get(course) + 1);
    }

    public Student[] getEnrolledStudents() {

        return new Student[1];
    }

    public Student[] getPreviousEnrolledStudents() {

        return new Student[1];
    }

    public Student[] getActiveAndPastStudents() {

        return new Student[1];
    }

    public Teacher[] getActiveTeachers() {

        return new Teacher[1];
    }

    public void printInfo() {
        System.out.println("Hello World!!!!!");
    }
}
