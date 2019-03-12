package com.romanbaida.hw3;

import java.time.Year;

public class Person {

  private String name;
  private int birthYear;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public Person() {
  }

  public Person(String name, int birthYear) {
    input(name, birthYear);
  }

  @Override
  public String toString() {
    return name + " is " + age() + " years old";
  }

  public int age() {
    return Year.now().getValue() - birthYear;
  }

  public void input(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  public void output() {
    System.out.println(toString());
  }

  public void changeName(String name) {
    setName(name);
  }

}
