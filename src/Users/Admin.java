package Users;

public class Admin extends Person{
  private int ID;
  private static int counter=3001;
  private final int salary=7000;

  public Admin(String name, int age, String phone, String email) {
    super(name, age, phone, email);
    this.ID=counter;
    counter++;
  }

  public int getID() {
    return ID;
  }

  public int getSalary() {
    return salary;
  }
}
