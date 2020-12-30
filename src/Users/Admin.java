package Users;
import System.SystemData;
public class Admin extends Person{
  private int ID;
  private static int counter=3001;
  private final int salary=7000;

  public Admin(String name, int age, String phone, String email) {
    super(name, age, phone, email);
    this.ID=counter;
    counter++;
    SystemData.getAdmins().add(this);
    SystemData.logininfo.put(String.valueOf(this.ID),String.valueOf(this.ID));
  }

  public Admin() {
    this.ID=counter;
    counter++;
    SystemData.getAdmins().add(this);
    SystemData.logininfo.put(String.valueOf(this.ID),String.valueOf(this.ID));
  }

  public int getID() {
    return ID;
  }

  public int getSalary() {
    return salary;
  }
}
