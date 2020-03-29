package hu.flow.paragraph_2.item4_noninstantiabilitywithprivateconstructor;

public class UtilityClass {
private UtilityClass() {
  throw new AssertionError();
}
}
