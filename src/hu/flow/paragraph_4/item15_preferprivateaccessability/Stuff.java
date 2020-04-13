package hu.flow.paragraph_4.item15_preferprivateaccessability;

import hu.flow.paragraph_4.Thing;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stuff {
  //Firts option: this is not good practice
  //public static final Thing[] VALUES = {new Thing("video", 1), new Thing("radio", 5)};

  //Second option: provide a public unmodifiable list
  private static final Thing[] PRIVATE_VALUES = {new Thing("video", 1), new Thing("radio", 5)};
  public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

  //Third: public copy method
  public static final Thing[] values() {
    return PRIVATE_VALUES.clone();
  }



}
