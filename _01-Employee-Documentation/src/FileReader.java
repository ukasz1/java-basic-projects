import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.HashMap;

//import java.io.IOException;

public class FileReader {
  private static final HashMap<String, Employee> list = new HashMap<>();

  public static HashMap<String, Employee> readList() {
    try {
      File myObj = new File("EmployeeList.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        Employee employee = new Employee();

        int id = 0;
        try {
          id = Integer.parseInt(myReader.next());
          employee.setId(id);
        } catch (NumberFormatException e) {
          System.out.println("An error occurred. File phrase conversion error.");
          return null;
        }

        String name = myReader.next();
        employee.setName(name);
        String surname = myReader.next();
        employee.setSurname(surname);

        int age = 0;
        try {
          age = Integer.parseInt(myReader.next());
          employee.setAge(age);
        } catch (NumberFormatException e) {
          System.out.println("An error occurred. File phrase conversion error.");
          return null;
        }

        String tin = myReader.next();
        employee.setTin(tin);
        String position = myReader.next();
        employee.setPosition(position);

        int salary = 0;
        try {
          salary = Integer.parseInt(myReader.next());
          employee.setSalary(salary);
        } catch (NumberFormatException e) {
          System.out.println("An error occurred. File phrase conversion error.");
          return null;
        }

        list.put(surname, employee);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred. File not found.");
      return null;
    } catch (NoSuchElementException e) {
      System.out.println("An error occurred. Missing file phrase.");
      return null;
    }
    return list;
  }
}
