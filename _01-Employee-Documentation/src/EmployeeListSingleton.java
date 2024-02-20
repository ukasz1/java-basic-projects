import java.util.HashMap;

public class EmployeeListSingleton {
  private static EmployeeListSingleton instance;
  private final HashMap<String, Employee> list;

  private EmployeeListSingleton() {
    list = FileReader.readList();
  }

  public static EmployeeListSingleton getInstance() {
    if (instance == null) {
      instance = new EmployeeListSingleton();
    }
    return instance;
  }

  public HashMap<String, Employee> getList() {
    return list;
  }

}
