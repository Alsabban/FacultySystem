package Users;
import System.SystemData;
import java.util.ArrayList;
import System.Course;
//import GUI.IDandPasswords;
public class Student extends Person{
    private int totalFees;
    private int paidFees;
    private int ID;
    private static int counter=1001;
    private float GPA;
    private ArrayList<Float> grades = new ArrayList<Float>();
    private ArrayList<Course> courses = new ArrayList<Course>();


    public Student(String name,int age, String phone, String email) {
        super(name,age,phone,email);
        this.ID=counter;
        this.GPA = 2.0F;
        counter++;
        SystemData.getStudents().add(this);
        SystemData.logininfo.put(String.valueOf(this.ID),String.valueOf(this.ID));
    }

    public  int getID() {
        return ID;
    }

    public void setTotalFees() {
        this.totalFees = this.calculateCreditHours()*1000;
    }

    public int getTotalFees() {
        return this.calculateCreditHours()*1000;
    }

    public ArrayList<Float> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Float> grades) {
        this.grades = grades;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(int paidFees) {
        this.paidFees = paidFees;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void registerCourse(Course course){
        courses.add(course);
        course.addStudent(this);


    }
    public int calculateCreditHours(){
        int totalCH=0;
        for (int i=0 ; i < this.courses.size(); i++){
            totalCH=totalCH + courses.get(i).getCreditHours();
        }
        return totalCH;
    }
    public float calculateGPA(){
        float totalGrades=0;
        for(int i=0 ; i < this.grades.size(); i++){
            totalGrades=totalGrades + grades.get(i);
        }
        this.GPA = totalGrades/grades.size();
        return this.GPA;
    }



}
