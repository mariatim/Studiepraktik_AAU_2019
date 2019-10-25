package Model;

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
   private ArrayList<String> courseName;
   private ArrayList<String> description;

    public  static  void  main(String[]){

        printInfo();

    }

    public Course(University university){

    }

    public String getCourseName(){ return "";
     courseName.add("Math");
     courseName.add("Design");
     courseName.add("Programming");
    }

    public String getDescription() { return "";
        description.add("Cool Math");
        description.add("The basics of design");
        description.add("Progamming 101");
    }

    public int getMaximumNumberOfStudents(){return -1; }

    public Teacher getTeacher(){
        return new Teacher();
    }

    public Student[] getEnrolledStudents(){
        return new Student[1];
    }

    public int getNumberOfEnrolledStudents(){
        return -1;
    }

    public int getAvailablePlaces(){ return -1;
    }

    public void printInfo(){
        for (int i = 0; i < courseName.size(); i++) {
            System.out.println(courseName.get(i));
            System.out.println(description.get(i));
            System.out.println(" ");
        }

    }
}
