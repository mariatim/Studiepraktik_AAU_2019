package Model;

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

    public Course[] getCoursesTaught(){
        return new Course[1];
    }

    public Course[] getPreviousCoursesTaught(){
        return new Course[1];
    }

    public Student[] getAllStudentTaught(){
        return new Student[1];
    }

    public void gradeToStudent(Student student){

    }

    public void printInfo(){}

}
