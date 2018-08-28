package ru.pelmegov;

import java.io.Serializable;

public class User implements Serializable {
  
  private static final long serialVersionUID = -401215465050L;
  
  
  private String name;
  private int age;
  
  public User(final String name, final int age) {
    this.name = name;
    this.age = age;
  }
  
  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}