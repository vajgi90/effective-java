package hu.flow.paragraph_2.item1_staticfactorymethod;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.*;

public class User {

  private final String name;
  private final String email;
  private final String country;
  private final static Logger LOGGER = Logger.getLogger(User.class.getName());

  public User(String name, String email, String country) {
    this.name = name;
    this.email = email;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getCountry() {
    return country;
  }

  public static User of(String name, String email, String country) {
    LOGGER.log(Level.INFO, "Creating User instance at : {0}", LocalTime.now());
    return new User(name, email, country);
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
