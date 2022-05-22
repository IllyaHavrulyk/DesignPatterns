package com.daun.industries.annotationProcessor;

@Immutable
public class SomeClass {
  private final String someProp = "SomeProc";
  private final int someInt = 1;
  private String someNotFinalProp;

  @Override
  public boolean equals(Object o) {
    return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    return "SomeClass{" +
        "someProp='" + someProp + '\'' +
        ", someInt=" + someInt +
        ", someNotFinalProp='" + someNotFinalProp + '\'' +
        '}';
  }
}
