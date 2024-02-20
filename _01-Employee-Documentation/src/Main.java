public class Main {
  public static void main(String[] args) {
    EmployeeListSingleton listInstance = EmployeeListSingleton.getInstance();

    ListPrinter listPrinter = new ListPrinter();
    listPrinter.printList(listInstance);
  }
}