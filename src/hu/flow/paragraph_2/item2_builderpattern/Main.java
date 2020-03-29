package hu.flow.paragraph_2.item2_builderpattern;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee.Builder().name("John").age(30).department("Finance").build();
    System.out.println(employee);
  }
}
