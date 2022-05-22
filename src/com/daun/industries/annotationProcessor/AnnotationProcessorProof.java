package com.daun.industries.annotationProcessor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AnnotationProcessorProof {

  public static void main(String[] args) {
    Map<SomeObj, SomeClass> someMap = new HashMap<>();
    someMap.put(new SomeObj("one"), new SomeClass());
    someMap.put(new SomeObj("two"), new SomeClass());
    someMap.forEach((key, value) -> System.out.println(key + "=" + value));
  }
}
