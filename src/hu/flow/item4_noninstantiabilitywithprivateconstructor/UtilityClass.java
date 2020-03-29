package hu.flow.item4_noninstantiabilitywithprivateconstructor;

public class UtilityClass {
private UtilityClass() {
  throw new AssertionError();
}
}
