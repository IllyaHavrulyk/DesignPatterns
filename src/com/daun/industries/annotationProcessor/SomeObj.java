package com.daun.industries.annotationProcessor;

public class SomeObj {
  private String someStr;

  public String getSomeStr() {
    return someStr;
  }

  public void setSomeStr(String someStr) {
    this.someStr = someStr;
  }

  public SomeObj(String someStr) {
    this.someStr = someStr;
  }

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
    return "SomeObj{" +
        "someStr='" + someStr + '\'' +
        '}';
  }
}
