package Model;
import java.util.HashMap;

public class Student{

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
    public String name;
    private HashMap<String, int> courseAndGrade = new HashMap<String, int>();

    public Student(){
        this.name = "Unassigned";
    }

    public  Student(String name){
        this.name = name;
    }

    public void attendUniversity(University university){

    }

    public void takeCourse(Course course){
        if (course.getAvailablePlaces()>0){
            courseAndGrade.put(course.getCourseName, 0);
        }else {
            System.out.println("Could not take course as there would be too many students.")
        }
    }

    public void dropCourse(Course course){
        courseAndGrade.remove(course.getCourseName());
        course.getMissingVaraible().remove(this);
    }

    public void getCoursesTaken(){

    }

    public void beGraded(int grade, Teacher teacher, Course course){

    }

    public int[] getGrades(){
        int[] grades = new int[courseAndGrade.size()];

        return grades;
    }

    public float getGradesAverage(){
        int sumOfGrades = 0;
        if(courseAndGrade.size() > 0){
            for (int i : courseAndGrade.value()){
                sumOfGrades += i;
            }

            return sumOfGrades/(float)courseAndGrade.size();
        }else {
            return -1f;
        }
    }


    public void printInfo(){

    }

}


