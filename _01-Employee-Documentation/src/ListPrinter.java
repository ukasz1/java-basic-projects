import java.util.HashMap;

public class ListPrinter {
  public void printList(EmployeeListSingleton instance) {
    for (Employee i : instance.getList().values()) {
      System.out.println(i.getName() + "\t" + i.getSurname() + "\t" + i.getAge() + "\t" + i.getTin() + "\t" + i.getPosition() + "\t" + i.getSalary());
    }
  }
}
