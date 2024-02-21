import java.util.HashMap;

public class ListPrinter {
  private void printHeading() {
    System.out.println(
            "ID\t" +
            "Surname\t" +
            "Name\t" +
            "Age\t" +
            "TIN\t" +
            "Position\t" +
            "Salary"
    );
    System.out.println("================================================");
  }

  private void printListElements(EmployeeListSingleton instance) {
    if (instance.getList() != null) {
      for (Employee i : instance.getList().values()) {
        System.out.println(i.getId() + "\t" + i.getName() + "\t" + i.getSurname() + "\t" + i.getAge() + "\t" + i.getTin() + "\t" + i.getPosition() + "\t" + i.getSalary());
      }
    }
  }

  public void printList(EmployeeListSingleton listInstance) {
    printHeading();
    printListElements(listInstance);
  }
}
