package hu.flow.paragraph_3.item11_overridehashcode;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

  private final int areaCode, prefix, lineNum;
  private int hashCode;

  public PhoneNumber(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof PhoneNumber)) {
      return false;
    }
    PhoneNumber pn = (PhoneNumber) o;
    return pn.lineNum == lineNum && pn.prefix == prefix
        && pn.areaCode == areaCode;
  }

  //    @Override public int hashCode() {
//        return Objects.hash(lineNum, prefix, areaCode);
//    }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = Integer.hashCode(areaCode);
      result = 31 * result + Integer.hashCode(prefix);
      result = 31 * result + Integer.hashCode(lineNum);
      hashCode = result;
    }
    return result;
  }

  public static void main(String[] args) {
    Map<PhoneNumber, String> m = new HashMap<>();
    m.put(new PhoneNumber(707, 867, 5309), "Jenny");
    System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
  }
}
