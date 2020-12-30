package Users;
//import GUI.IDandPasswords;
import System.SystemData;
import java.util.ArrayList;
import System.Course;
public class Professor extends Person{
    private int gradYear;
    private int ID;
    private int salary;
    private static int counter=2001;
    private String awards[];
    private String books[];
    private ArrayList<Course> courses = new ArrayList<Course>();


    public Professor(String name, int age, String phone, String email) {
        super(name, age, phone, email);
        this.ID = counter;
        this.salary=0;
        counter++;
        SystemData.getProfessors().add(this);
        SystemData.logininfo.put(String.valueOf(this.ID),String.valueOf(this.ID));
    }

    public Professor(String name, int age, String phone, String email, int gradYear, String[] awards, String[] books) {
        super(name,age,phone,email);
        this.gradYear = gradYear;
        this.awards = awards;
        this.books = books;
        this.ID = counter;
        this.salary=0;
        counter++;
        SystemData.getProfessors().add(this);
       SystemData.logininfo.put(String.valueOf(this.ID),String.valueOf(this.ID));
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Professor.counter = counter;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void assignCourse(Course course){
        courses.add(course);
        course.addProfessor(this);
    }
    public int calculateCreditHours(){
        int totalCH=0;
        for (int i=0 ; i < this.courses.size(); i++){
            totalCH=totalCH + courses.get(i).getCreditHours();
        }
        return totalCH;
    }
    public int caclulateSalary(){
        return calculateCreditHours()*2000;

    }
    public void assignGrade(Student student, Float grade){
        student.getGrades().add(grade);
    }
}
