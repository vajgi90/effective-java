package hu.flow.paragraph_2.item8_avoidfinalizersandcleaners;

public class Adult {
  public static void main(String[] args) throws Exception {
    try(Room myRoom = new Room(7)) {
      System.out.println("Goodbye");
    }

  //This will never cleaned
  new Room(99);
    System.out.println("Peace out!");
  }
}
