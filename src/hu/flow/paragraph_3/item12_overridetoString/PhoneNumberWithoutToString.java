package hu.flow.paragraph_3.item12_overridetoString;

import hu.flow.paragraph_3.item11_overridehashcode.PhoneNumber;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberWithoutToString {
  private int areaCode, prefix, lineNum;
  private int hashCode;

  public PhoneNumberWithoutToString(int areaCode, int prefix, int lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }
  public static void main(String[] args) {
    System.out.println("--------------------------------------");
    PhoneNumberWithoutToString num1 = new PhoneNumberWithoutToString(62, 867, 707);
    System.out.println("Without a good toString() method the information is useless");
    System.out.println(num1);
    System.out.println("--------------------------------------");
    System.out.println("Class with an adecvat toString() method");
    PhoneNumberWithToString num2 = new PhoneNumberWithToString(62, 867,707);
    System.out.println(num2);
  }
}
