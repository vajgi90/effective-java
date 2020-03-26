package hu.flow.item1_staticfactorymethod;

public class Main {

    public static void main(String[] args) {
    User normallyCretedUser = new User("George", "george@gmail.com", "Germany");
    System.out.println(normallyCretedUser);
    System.out.println("________________________________");
	  User staticUser = User.of("Thomas", "user@gmail.com", "France");
	  System.out.println(staticUser);
    }
}
