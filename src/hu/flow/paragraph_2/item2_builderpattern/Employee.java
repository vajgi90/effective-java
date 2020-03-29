package hu.flow.paragraph_2.item2_builderpattern;

public class Employee {
    private final String name;
    private final int age;
    private final String department;

    private Employee(String name, int age, String department) {
      this.name = name;
      this.age = age;
      this.department = department;
    }

  public static class Builder {

    private String name;
    private int age;
    private String department;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder department(String department) {
      this.department = department;
      return this;
    }
    public Employee build() {
      return new Employee(name, age, department);
    }
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", department='" + department + '\'' +
        '}';
  }
}
