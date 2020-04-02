package hu.flow.paragraph_3.item10_overridingequals;

import java.util.Objects;

public class CaseInsensitiveString {
  private final String word;

  public CaseInsensitiveString(String word) {
    this.word = Objects.requireNonNull(word);
  }

  // Broken - violates symmetry!
  @Override public boolean equals(Object word) {
    if (word instanceof CaseInsensitiveString)
      return String.valueOf(word).equalsIgnoreCase(
          ((CaseInsensitiveString) word).word);
    if (word instanceof String)  // One-way interoperability!
      return String.valueOf(word).equalsIgnoreCase((String) word);
    return false;
  }
}
