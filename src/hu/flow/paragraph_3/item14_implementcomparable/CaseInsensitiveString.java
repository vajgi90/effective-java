package hu.flow.paragraph_3.item14_implementcomparable;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public final class CaseInsensitiveString
    implements Comparable<CaseInsensitiveString> {
  private final String s;

  public CaseInsensitiveString(String s) {
    this.s = Objects.requireNonNull(s);
  }

  @Override public boolean equals(Object o) {
    return o instanceof CaseInsensitiveString &&
        ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
  }

  @Override public int hashCode() {
    return s.hashCode();
  }

  @Override public String toString() {
    return s;
  }

  public int compareTo(CaseInsensitiveString cis) {
    return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
  }

  public static void main(String[] args) {
    Set<CaseInsensitiveString> s = new TreeSet<>();
    String[] listOfStrings = {"Dog", "dog", "fox", "Fox", "FOX"};
    for (String arg : listOfStrings)
      s.add(new CaseInsensitiveString(arg));
    System.out.println(s);
  }
}
