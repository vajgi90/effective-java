package hu.flow.paragraph_3.item13_overrideclone;

public class User {

  private int age;
  private String username;
  private String email;

  public User(int age, String username, String email) {
    this.age = age;
    this.username = username;
    this.email = email;
  }

  //Copy constructor
  //1. The copy constructor is much easier to implement. We do not need to implement the Cloneable interface and handle CloneNotSupportedException.
  //2. The clone method returns a general Object reference. Therefore, we need to typecast it to the appropriate type.
  //3. We can not assign a value to a final field in the clone method. However, we can do so in the copy constructor.
  public User(User user) {
    this.age = user.age;
    this.username = user.username;
    this.email = user.email;
  }

  //Copy factory
  public static User newInstance(User user) {
    return new User(user.age, user.username, user.email);
  }
}
