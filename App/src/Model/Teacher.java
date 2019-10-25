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

    private String name = "";
    private int age = 0;
    private ArrayList<String> University = new ArrayList<String>;
    private ArrayList<String> Course = new ArrayList<String>;
    private ArrayList<String> Student = new ArrayList<String>;

    //constructor
    public Teacher(){
        this.name = "no name";
    }
    public  Teacher(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }

    public void setName(String newName){ this.name = newName; }

    public void setAge(int newAge){ this.age = newAge; }

    public Course[] getCoursesTaught(){ return new Course; }

    public Course[] getPreviousCoursesTaught(){ return new Course; }

    public Student[] getAllStudentTaught(){ return new Student; }

    public void gradeToStudent(Student student){

    }

    public void printInfo(){
        System.out.println("All students taught: " + this.getAllStudentTaught());
        System.out.println("more info to come...");
    }

}
