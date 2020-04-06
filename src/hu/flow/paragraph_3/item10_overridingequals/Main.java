package hu.flow.paragraph_3.item10_overridingequals;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    CaseInsensitiveString cis = new CaseInsensitiveString("Ungarisch");
    String s = "ungarisch";

    List<CaseInsensitiveString> list = new ArrayList<>();
    list.add(cis);

    System.out.println(list.contains(s));
  }
}
